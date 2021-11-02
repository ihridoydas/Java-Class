
//200517　2C リドチャンダラ
import java.io.*;

public class ZenF03 {
    public static void main(String[] args) throws IOException {

        System.out.println("整数を入力してください");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();

        int resNumber = Integer.parseInt(number);

        if (resNumber % 2 == 0) {
            System.out.println(resNumber + "偶数です");
        } else {

            System.out.println(resNumber + "奇数です");
        }

    }
}
