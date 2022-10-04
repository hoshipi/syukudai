public class Monster {

    public String name;
    public int level;

    public int hp;
    public int mp;
    public int power;
    public int defense;
    public int agility;

    public String profile;


    public void setName(String name){
        this.name = name;
    }

    public void setLevel(int level){
        this.level  = level;
    }

    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }

    public void setHp(int hp){
        this.hp  = hp;
    }

    public int getHp(){
        return this.hp;
    }

    public void setMp(int mp){
        this.mp  = mp;
    }

    public int getMp(){
        return this.mp;
    }

    public void setPower(int power){
        this.power  = power;
    }

    public int getPower(){
        return this.power;
    }

    public void setDefense(int defence){this.defense  = defense;}

    public int getDefense(){
        return this.defense;
    }

    public void setAgility(int agility){
        this.agility  = agility;
    }

    public int getAgility(){
        return this.agility;
    }

    public void showProfile() {
        System.out.println("モンスターの名前は" + this.name);
    }



}
