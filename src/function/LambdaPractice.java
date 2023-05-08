package function;
import java.util.Arrays;
import java.util.List;
public class LambdaPractice{
    public static void Main(String[] args){
        //フィールド
        class Student {
            String name;
            int score;

            //コンストラクタ
            Student(String name, int score) {
                this.name = name;
                this.score = score;
            }
        }

        List<Student> students = Arrays.asList(
                new Student("i",500),
                new Student("n",450),
                new Student("s",600),
                new Student("y",300),
                new Student("g",2147483647)
        );

    }

}
