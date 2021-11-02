
class MainCar {
    int num;
    double gas;

    void setNum(int n) {
        num = n;
        System.out.println("ナンバーを" + num + "にしました");
    }

    void setGas(double g) {
        gas = g;
        System.out.println("ガソリン代" + gas + "にしました");
    }

    void show() {
        System.out.println("車のナンバーを" + num + "にしました");
        System.out.println("ガソリン" + gas + "にしました");
    }

}

public class L8Sample1 {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = 20.5;

        car1.show();

        Car car2 = new Car();
        car2.num = 3456;
        car2.gas = 22.5;
        car2.show();

        MainCar car3 = new MainCar();

        car3.setNum(1234);
        car3.setGas(20.5);
    }

}
