
//クラス　2C（（２００５１７） 名前　リドチャンダラ　
import java.io.*;

public class L6SampleP2 {
    public static void main(String[] args) throws IOException {
        System.out.println("テストの点数を入力してください。(0で終了)");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int total = 0;

        do {
            String str = input.readLine();
            i = Integer.parseInt(str);
            total += i;
        } while (i != 0);
        System.out.println("テストの合計点は" + total + "点です。");

    }
}
