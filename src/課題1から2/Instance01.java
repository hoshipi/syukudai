package 課題1から2;

import java.util.Scanner;

public class Instance01 {

    public static void main(String[] args) {

        Monster monster = new Monster();

        Scanner scanner = new Scanner(System.in);

        System.out.println("モンスターの名前を入力してください。");

        monster.setName(scanner.nextLine());

        monster.showProfile();
    }
}
