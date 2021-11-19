//2C ダスリドチャンダラ

class MyPoint{
    int X;
    int Y;

    void setX(int px){
        X=px;
    }
    void setY(int py){
        Y=py;
    }
    int getX(){
        return X;
    }
    int getY(){
        return Y;
    }
}

public class L8SampleP2 {
    public static void main(String[] args) {
        MyPoint mp=new MyPoint();

        mp.setX(10);
        mp.setY(50);
        System.out.println(mp.getX());
        System.out.println(mp.getY());
    }
}
