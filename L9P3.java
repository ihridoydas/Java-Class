import java.io.*;

public class L9P3 {

    public static void main(String[] args) throws IOException {

        CarP3 car1 = new CarP3();
        CarP3 car2 = new CarP3();

        car1.setData("TOYOTA");
        car2.setData("HONDA");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1台目のスピード入力してください");
        String str = br.readLine();
        int res = Integer.parseInt(str);
        car1.setData(res, "TOYOTA ");

        System.out.println("2台目のスピード入力してください");
        str = br.readLine();
        res = Integer.parseInt(str);
        car2.setData(res, "HONDA　");

        System.out.println(car1.getName() + "の位置：" + car1.getPos());
        System.out.println(car2.getName() + "の位置：" + car2.getPos());

        if (car1.getPos() > car2.getPos()) {

            System.out.println(car1.getName() + "が勝っています");
        } else {

            System.out.println(car2.getName() + "が勝っています");

        }

    }
}
