import java.util.Scanner;

public class Hairetu02 {
    int num[] = new int[5];

    int nmax[] = new int[5];

    int a;
    int b;

    int c;

    for(a = 0; a <= 4; a++){
        Scanner scanner = new Scanner(System.in);

        System.out.println("数字を入力してください。");
        num[a] = scanner.nextInt();


    }




    for(b = 0; b <= 4; b++){

        nmax[b] = num[0];

        for (c = 0; c <= 4; c++) {
            if (nmax[b] > num[c]) {
                nmax[b = num[c];
            }

        }
    }

}
