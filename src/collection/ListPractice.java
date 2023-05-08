package collection;

import java.util.ArrayList;//数を任意設定できる配列がつかえるようにclass
import java.util.Collections;//ソート機能が使えるように
import java.util.List;//listが使えるようにinterface
import java.util.Scanner;//文字の入力ができるように
public class ListPractice {
    public static void main(String []args){
        Scanner uteyo = new Scanner(System.in);
        List<String/*参照型のみ*/> namae = new ArrayList<>();
        System.out.println("名前を入力してください");
        while(true){
            String name = uteyo.nextLine();
            if(name.equals("exit")){
                break;
            }
            namae.add(name);
        }
//出力結果ゾーン
        System.out.println("最初の人" + namae.get(0));
        System.out.println("最後の人" + namae.get(namae.size()-1));//exitが入力されてるから-1

        Collections.sort(namae,(s1,s2) -> {return s1.compareToIgnoreCase(s2);});
//sort機能を使いs1 s2にnamae代入後、
        System.out.println("並べ替えます");
        namae.forEach(System.out::println);
    }
}
