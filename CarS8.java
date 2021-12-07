public class CarS8 {
    
    public static int sum =0;
    private int num;
    private double gas;

    public CarS8(){
        num = 0;
        gas = 0.0;
        System.out.println("make a car");
    }

    public void setCar(int n,double g){

        num = n;
        gas = g;
        sum ++;
        System.out.println("num: "+ num + " gas: "+ gas);
    }

    public static void showSum(){
        
        System.out.println("car count:" +sum);

    }
    public void show(){
        System.out.println("num: " + num);
        System.out.println("gas: " + gas);
    }

}
