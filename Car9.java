public class Car9 {
    
    int num;
    double gas;

    public Car9()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました");

    }

    public void setCar(int n,double g){

        num =n;
        gas = g;
        System.out.println("ナンバー："+ num + "にガソリン" + gas);

    }

    public void show(){

        System.out.println("車のナンバーは"+num);
        System.out.println("ガソリンだい"+ gas);
    }
}
