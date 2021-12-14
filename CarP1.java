public class CarP1 {
    public static int sum =0;

    public int num;
    public double gas;

    public CarP1(){

        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("車を作成しました");

    }

    public void setCar(int n,double g){

        num =n;
        gas = g;
        System.out.println("ナンバーを" + num + "がスリン量を"+ gas + "にしました");
    }

    public static void showSum(){

        System.out.println("車は全部で"+ sum + "台あります");
        
    }

    
    public void show(){

        System.out.println("車のナンバーは"+ num + "です");
        System.out.println("がスリン量は"+ gas + "です");

    }



}
