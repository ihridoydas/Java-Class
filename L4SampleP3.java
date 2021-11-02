
//200517 2C　ダスリドチャンダラ
import java.io.*;

public class L4SampleP3 {

    public static void main(String[] args) throws IOException {

        System.out.println("正方形の辺の長さを入力してください。");
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

        String sqr = data.readLine();

        int Sqr = Integer.parseInt(sqr);
        int result = Sqr * Sqr;

        System.out.println("正方形の面積は" + result + "です");
    }
}
