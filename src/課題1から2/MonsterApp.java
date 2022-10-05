package 課題1から2;

import java.util.Scanner;

public class MonsterApp{

    public static void main(String[] args) {

        Monster monster = new Monster();

        Scanner scanner = new Scanner(System.in);

        System.out.println("モンスターの名前を入力してください。");

        monster.setName(scanner.nextLine());

//        String monstername = scanner.nextLine();
//        monster.setName(monstername);


        System.out.println("モンスターのレベルを入力してください。");


        monster.setLevel(scanner.nextInt());


        System.out.println("モンスターのヒットポイントを入力してください。");


        monster.setHp(scanner.nextInt());

        System.out.println("モンスターのマジックポイントを入力してください。");


        monster.setMp(scanner.nextInt());

        System.out.println("モンスターの攻撃力を入力してください。");


        monster.setPower(scanner.nextInt());

        System.out.println("モンスターの防御力を入力してください。");


        monster.setDefense(scanner.nextInt());

        System.out.println("モンスター素早さを入力してください。");

        monster.setAgility(scanner.nextInt());


        System.out.println("モンスターの名前は" +monster.getName());
        System.out.println("モンスターのレベルは" +monster.getLevel());

        System.out.println("モンスターのヒットポイントは" +monster.getHp());
        System.out.println("モンスターのマジックポイントは" +monster.getMp());
        System.out.println("モンスターの攻撃力は" +monster.getPower());
        System.out.println("モンスターの防御力は" +monster.getDefense());
        System.out.println("モンスターの素早さは" +monster.getAgility());


    }


}
