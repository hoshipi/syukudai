package 課題1から2;

public class Kurikaesi02 {
    public static void main(String[] args) {
        int i;
        int n;

        for(i = 1; i<= 9; i++){

            for(n = 1; n<= 9; n++){
                int kuku = i * n;
                System.out.print("|");

                if(kuku < 10){
                    System.out.print(" ");
                }

                System.out.print(kuku);

            }
            System.out.print("|");
            System.out.println();
        }

    }
}
