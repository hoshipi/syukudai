import java.util.Scanner;

public class CalculationApp {

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("xを入力してください。");

        calculation.setX(scanner.nextInt());

        System.out.println("yを入力してください。");

        calculation.setY(scanner.nextInt());

        System.out.println("zを入力してください。");

        calculation.setZ(scanner.nextInt());

        System.out.println("xとyを比較して大きい方は" +calculation.selectBigNum2()+"です。");


        System.out.println("xとyとzを比較して大きい方は" +calculation.selectBigNum3()+"です。");


    }
}
