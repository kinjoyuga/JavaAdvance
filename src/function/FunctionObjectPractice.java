package function;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;
public class FunctionObjectPractice {
        //奇数か偶数か判断する
        public static void main(String[] args){
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4));

        System.out.println(isEven.test(5));

        //文字列を反転する
        Function<String,String> reverseString = str -> new StringBuilder(str).reverse().toString();

        System.out.println(reverseString.apply("i'm fine"));

        //文字列を指定した区切り文字で分割
        Function<String,String[]> san = str -> str.split(",");
        String[] zin = san.apply("冷蔵庫,洗濯機,テレビ");
        System.out.println(Arrays.toString(zin));

        //整数値を指定された回数だけ二倍
        UnaryOperator<Integer> nibaix = x -> {
                int g = x;
                for (var i=0; i<10;i++){
                        g *= 2;
                }
                return g;
        };
        System.out.println(nibaix.apply(9));

        //与えられた文字列を指定分繰り返す
        BiFunction<String,Integer,String> tunagi = (str,n) -> {
                StringBuilder ba = new StringBuilder();
                for(int i=0; i<n; i++){
                    ba.append(str);
                }
                return ba.toString();
        };

        System.out.println(tunagi.apply("hello",5));

        }
}
