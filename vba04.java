//クラス　2C（（２００５１７） 名前　リドチャンダラ　
import java.io.*;

public class vba04 {
    public static void main(String[] args) throws IOException {
        int total, i, data1, data2;
        System.out.println("最初のデータを入力してください");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        data1 = Integer.parseInt(str);
        System.out.println("最後のデータを入力してください");
        String str1 = input.readLine();
        data2 = Integer.parseInt(str1);

        total = 0;

        for (i = data1; i <= data2; i++) {

            total = total + i;
        }

        System.out.print(data1 + "~" + data2 + "までの合計は" + total);
    }

}
