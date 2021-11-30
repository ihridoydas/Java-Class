public class CarS3 {

    private int num;
    private double gas;


public void setCar(int n){

    num = n;
    System.out.println("num change");

}
public void setCar(double g){
    gas = g;
    System.out.println("gas Change");
}
public void setCar(int n,double g){
    num = n;
    gas = g;
    System.out.println("num gas change");
}
public void show(){
    System.out.println("num:"+num);
    System.out.println("gas:"+gas);
}
    
}
