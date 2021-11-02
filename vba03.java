
//クラス　2C（（２００５１７） 名前　リドチャンダラ　
import java.io.*;

public class vba03 {

    public static void main(String[] args) throws IOException {

        int i;
        System.out.println("データを入力してください");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        i = Integer.parseInt(str);

        do {

            if (i >= 0 && i <= 10) {
                System.out.println("I");
            } else if (i == 11) {
                System.out.println("A");
            } else if (i == 12) {
                System.out.println("B");
            }

            else if (i == 13) {
                System.out.println("C");
            } else if (i == 14) {
                System.out.println("D");
            }

            else if (i == 15) {
                System.out.println("F");
            } else {
                System.out.println("Error");
            }

        } while (i >= 15);
        i = i + 1;

    }

}
