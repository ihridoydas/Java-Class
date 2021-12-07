public class CarS5 {
    private int num;
    private double gas;

    public CarS5()
    {
        num= 0;
        gas= 0.0;
        System.out.println("車を作成しました");
    }

    public CarS5(int n,double g){
        num =n;
        gas =g;
        System.out.println("ナンバー"+ num + "がスリンだい"+ gas + "nの車を作成しました");
    }
    public void show(){
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("がスリンだい" + gas + "です");
    }
}
