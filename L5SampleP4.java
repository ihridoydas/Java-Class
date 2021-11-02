
//200517　2C リドチャンダラ
import java.io.*;

public class L5SampleP4 {

    public static void main(String[] args) throws IOException {

        System.out.println("０から１０までの整数を入力してください");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();

        int num = Integer.parseInt(number);

        if (num >= 0 && num <= 10) {
            System.out.println("正解です");
        } else {

            System.out.println("エラー");
        }

    }
}
