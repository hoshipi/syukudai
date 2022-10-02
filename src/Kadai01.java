import java.util.Scanner;

public class Kadai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("上期受注件数を入力してください。");
        int kamiki = scanner.nextInt();

        System.out.println("下期受注件数を入力してください。");
        int simoki = scanner.nextInt();


        if (((kamiki >= 30) && (simoki >= 30)) || ((kamiki + simoki) >= 65) ) {
            System.out.println("優良です");
        } else if(((kamiki + simoki) >= 50) || ((kamiki >= 45) || (simoki >= 45))) {
            System.out.println("優良です");
        }else{
            System.out.println("普通です");
        }
    }
}
