public class Calculation {

    public int x;
    public int y;
    public int z;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setZ(int z){
        this.z = z;
    }

    public int selectBigNum2(){
        return Math.max(x, y);
    }

    public int selectBigNum3(){
        return Math.max(Math.max(x, y), z);
    }

}
