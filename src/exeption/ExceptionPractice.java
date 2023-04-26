package exeption;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        while (true) {
            String input = scanner.nextLine();
            try {
                score = Integer.parseInt(input);
                String result = judgeScore(score);
                System.out.println("判定結果: " + result);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください。");
            } catch (RuntimeException e) {
                System.out.println("エラー: " + e.getMessage());
            }
        }
        scanner.close();
    }

    public static String judgeScore(int score) {
        if (score < 0 || score > 100) {
            throw new RuntimeException("スコアは0から100の範囲で入力してください。");
        } else if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}