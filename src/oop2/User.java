// User.java
package oop2;/*oopのパッケージ*/

import java.time.LocalDate;
import java.util.Objects;/*データを取り込んでいる*/

public record User(String name, String birthplace, LocalDate birthdate) {
/*recordでクラス宣言　文字型name 文字型birthplace 参照型 日付birthdate
  日付を表すJavaのクラスで、年、月、日を含むイミュータブル（変更不可能な）オブジェクト*/

    //始まり
    public static void main(String[] args) {
        User user1 = new User("山田", "東京都", LocalDate.of(1990, 4, 1));
        User user2 = new User("上田", "大阪府", LocalDate.of(2000, 2, 15));
        User user3 = new User("山田", "東京都", LocalDate.of(1990, 4, 1));


        System.out.println(user1.equals(user2));/*user1と2の文字列の比較*/
        System.out.println(user1.equals(user3));/*user1と3*/


        System.out.println(user1);  //名前：山田太郎, 出身地：東京都, 生年月日：1990-04-01
        System.out.println(user3);  //名前：田中花子, 出身地：大阪府, 生年月日：1995-02-15

    }



    @Override
    public boolean equals(Object o) {/*object型の変数oを引数にして*/
        if (this == o) {/*Oが現在のオブジェ参照or比較*/
            return true;/*oはok*/
        }
//＝同じobjectなら絶対一緒

        if (!(o instanceof User user)) {/*o(左)がクラス(右)Userのインスタンスuserではないとき*/
            return false;/*oは違う*/
        }
/*instanceofはオブジェクトが特定のクラスやそのサブクラスのインスタンスであるかどうかを確認するJavaの演算子
  基本左にオブジェクト、右にクラス
＝インスタンスじゃないなら絶対違う*/

        return Objects.equals(name, user.name) &&
                Objects.equals(birthplace, user.birthplace) &&
                Objects.equals(birthdate, user.birthdate);
        /*equalsは文字列の真偽比較。名前且つ出身地且つ誕生日が一緒ならtrue,違うならfalse*/
    }

    @Override
    public String toString() {/*文字型でmainへ*/
        return "名前：" + name + ", 出身地：" + birthplace + ", 生年月日：" + birthdate;
    }

}