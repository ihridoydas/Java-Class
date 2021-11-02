public class L8Sample4 {

    public static void main(String[] args) {

        // Car.java が必要です

        Car car1 = new Car();

        car1.setNum(1234);
        car1.setGas(20.5);

        int number = car1.getNum();
        double gasnum = car1.getGas();

        System.out.println("ナンバーは" + number);

        System.out.println("ガス代ーは" + gasnum);

    }

}
