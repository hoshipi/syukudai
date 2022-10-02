import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Hairetu02 {

    public static void main(String[] args) {
        Integer num[] = new Integer[5];

        int a;


        for (a = 0; a <= 4; a++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("数字を入力してください。");
            num[a] = scanner.nextInt();


        }


        Arrays.sort(num, Collections.reverseOrder());
        System.out.println(Arrays.toString(num));

    }
}
