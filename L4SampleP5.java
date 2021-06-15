
//200517 2C　ダスリドチャンダラ
import java.io.*;

public class L4SampleP5 {

    public static void main(String[] args) throws IOException {

        System.out.println("科目１~5 の点数を入力してください。");
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

        String inputd1 = data.readLine();
        String inputd2 = data.readLine();
        String inputd3 = data.readLine();
        String inputd4 = data.readLine();
        String inputd5 = data.readLine();

        int dataIn1 = Integer.parseInt(inputd1);

        int dataIn2 = Integer.parseInt(inputd2);

        int dataIn3 = Integer.parseInt(inputd3);

        int dataIn4 = Integer.parseInt(inputd4);

        int dataIn5 = Integer.parseInt(inputd5);

        int result = (dataIn1 + dataIn2 + dataIn3 + dataIn4 + dataIn5);

        System.out.println("正方形の会計点は" + result + "です");
        System.out.println("正方形の平均点は" + (double) result / 5 + "です");

    }
}
