//200517 2C　ダスリドチャンダラ

import java.io.*;

public class ZenF02 {

    public static void main(String[] args) throws IOException {

        System.out.println("三角形の辺を高さを入力してください。");
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

        String inputd1 = data.readLine();

        String inputd2 = data.readLine();

        int dataIn1 = Integer.parseInt(inputd1);

        int dataIn2 = Integer.parseInt(inputd2);
        Double result = (((double) dataIn1 * dataIn2) / 2);

        System.out.println("三角形の面積は" + result + "です");
    }
}
