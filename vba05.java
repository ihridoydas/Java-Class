//クラス　2C（（２００５１７） 名前　リドチャンダラ　
import java.io.*;

public class vba05 {

    public static void main(String[] args) throws IOException {

        int ans, data;

        System.out.println("数字を入力してください");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        data = Integer.parseInt(str);

        ans = 1;

        do {
            for (int i = 1; i <= data; i++) {
                ans *= i;
            }

        } while (data == 0);

        System.out.println(ans);

    }
}
