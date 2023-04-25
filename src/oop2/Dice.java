package oop2;
import java.util.Random;

//cast()とsee()の動作を確認するためのクラス
class DiceTest {
    public static void main(String[] args) {
        Dice saikoro = new Dice(); // Diceクラスのインスタンスを生成。

        // 30回サイコロを振って結果を表示する
        for (int i = 1; i <= 30; i++) {
            int result = saikoro.cast();/*cast()に仕事ぶん投げsaikoroに戻させる*/
            System.out.println("ダイスを振った結果: " + result);
        }

        // 最後に振った結果を表示
        int lastResult = saikoro.see();/*値リセットされていないsaikoroをsee()にぶん投げる*/
        System.out.println("最後に振った結果: " + lastResult);
    }

}

//サイコロ表現のための宣言
class Dice {

    //フィールド
    int lastResult; // 最後に振った結果を保持するフィールド

    // コンストラクタは不要なので省略

    // サイコロを振るメソッド　戻り値int
    int cast() {
        Random ransuu = new Random();
        lastResult = ransuu.nextInt(6) + 1; // 0から6未満+1のランダムな値を生成、代入
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

class CheatDice extends Dice{
    private int castCount;

    //作成途中
@Override
int cast() {
    int result;
    if (castCount % 6 == 0) { // 6の倍数回目には必ず6を出す
        result = 6;
    } else {
        result = super.cast(); // 親クラスのcast()メソッドを呼び出して通常の振りを行う
    }
    return result;
}
}