package 課題1から2;

import java.util.Scanner;

public class Hairetu01 {
    public static void main(String[] args) {
        int num[];
        num = new int[5];

        for(int i = 0; i<=4; i++){
            Scanner scanner = new Scanner(System.in);

            System.out.println("数字を入力してください。");
            num[i] = scanner.nextInt();


        }

        System.out.println("配列の要素は以下の通りです");

        for(int i = 0; i<=4; i++){


            System.out.println(num[i]);

        }
    }
}
