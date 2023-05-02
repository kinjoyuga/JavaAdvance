package EnumPractice;

import java.time.LocalDate;//日付を表すためのクラス、年月日を扱う

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();//今日に今の曜日をみつけ、todayに入れる
        DayOfWeek dayOfWeek = DayOfWeek.getDayOfWeek(today);//Day型day(ry に曜日を表す要素
        System.out.println("今日は" + dayOfWeek.getJapaneseName() + "です。");//day(ryの中のニホンゴ出力
    }
}
