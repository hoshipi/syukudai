import java.util.Scanner;

public class CalculationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("xを入力してください。");

        int x = scanner.nextInt();

        System.out.println("yを入力してください。");

        int y = scanner.nextInt();

        System.out.println("zを入力してください。");

        int z = scanner.nextInt();

        System.out.println("xとyを比較して大きい方は" +Calculation.selectBigNum2(x,y)+"です。");


        System.out.println("xとyとzを比較して大きい方は" +Calculation.selectBigNum3(x, y, z)+"です。");


    }
}
