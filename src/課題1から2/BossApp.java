package 課題1から2;

public class BossApp {
    public static void main(String[] args) {


        try{
            Integer num = null;
            num *= 10;
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());

        }

    }


}
