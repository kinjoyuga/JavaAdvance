package EnumPractice;

import java.time.LocalDate;//日付を表すためのクラス、年月日を扱う

enum DayOfWeek {//Enumで宣言されたものは暗黙的にpublicだから宣言しなくてもいい
    MONDAY("月曜日"),//標準ライブラリDayOfWeekには
    TUESDAY("火曜日"),//すでに７つ要素があって
    WEDNESDAY("水曜日"),//列挙型として
    THURSDAY("木曜日"),//それぞれの要素に対して
    FRIDAY("金曜日"),//コンストラクタで
    SATURDAY("土曜日"),//日本語の曜日を
    SUNDAY("日曜日");//追加している


    //enumのDayOf(ry のフィールド,名前はjap(ry
    private final String japaneseName;

    //enumのコンストラクタ
    DayOfWeek(String japaneseName) {
        this.japaneseName = japaneseName;
    }

    public String getJapaneseName() {
        return japaneseName;
//jap(ryフィールド値を返す＝ニホンゴ
    }

//Local(ryオブジェクト受け取り、対応するday(ry を返す
    public static DayOfWeek getDayOfWeek(LocalDate date) {
        return DayOfWeek.valueOf(date.getDayOfWeek().toString());
/*
toString() メソッドによって曜日の名前を取得
value0fでda(ry の列挙型要素が取得される。
*/
    }
}
