package 課題1から2;

import java.util.Scanner;

public class Kurikaesi01 {
    public static void main(String[] args) {

        int i;

        Scanner scanner = new Scanner(System.in);

        System.out.println("入力してください。");
        int num = scanner.nextInt();

        for(i = 1;num > 0;i++){
            num = num - 1;
            System.out.println("繰り返し" + i + "回目は"+ num);
        }

    }
}
