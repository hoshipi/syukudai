import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("入力してください。");
        int num = scanner.nextInt();


        if (num % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }


    }
}