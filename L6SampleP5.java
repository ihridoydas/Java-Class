//クラス　2C（（２００５１７） 名前　リドチャンダラ
import java.io.*;
public class L6SampleP5 {
    public static void main(String[] args) throws IOException {
        System.out.println("");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int num = Integer.parseInt(str);
        for (int val = 2; val <= num; val++) {
            if (val == num) {
                System.out.println(num + " は素数です。");
            } else if (num % val == 0) {
                System.out.println(num + " は変数ではありません。");
                break;
            }
        }

    }
}
