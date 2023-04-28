package oop2;
import java.util.Random;

//cast()とsee()の動作を確認するためのクラス
class DiceTest {
    public static void main(String[] args) {
        Dice dice = new cheatDice(); // Diceクラスのインスタンスを生成。ここが原因で一日つぶれた

        // 30回サイコロを振って結果を表示する
        for (int i = 1; i <= 30; i++) {
            int result = dice.cast();/*cast()にdiceぶん投げ、resultに入れる。*/
            System.out.println("ダイスを振った結果" + i + "回目: " + result);
        }

        // 最後に振った結果を表示
        int lastResult = dice.see();/*値リセットされていないdiceをsee()に確認をとり、lastResultに入れる。*/
        System.out.println("最後に振った結果: " + lastResult);
    }

}

//サイコロ表現のための宣言
class Dice {
    //フィールド
    int lastResult; // 最後に振った結果を保持するフィールド

    // コンストラクタは不要なので省略

    // サイコロを振るメソッドだがcheatDiceが呼んだときだけ動く。　　戻り値int
    int cast() {
        Random result = new Random();
        lastResult = result.nextInt(6) + 1; // 0から6未満+1のランダムな値を生成、代入
        return lastResult;
    }

    // 出目を確認するメソッド　戻り値int
    int see() {
        if (lastResult == 0) { // 一度も振っていない場合orシンプル0なら1を返す
            return 1;
        } else {
            return lastResult;
        }
    }
}


class cheatDice extends Dice{
    private int castCount; // 振った回数をカウントするフィールド

    public cheatDice() {
        this.castCount = 0;
    }

    @Override
    int cast() {
        int result;

        castCount += 1;
        if (castCount % 6 == 0) { // 6回目には必ず6を出す
            result = 6;
        } else {
            result = super.cast(); // 親クラスのcast()メソッドを呼び出して値を取得
        }

        lastResult = result; // 最後に振った結果を更新
        return result;
    }
}