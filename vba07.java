
//クラス　2C（（２００５１７） 名前　リドチャンダラ　
import java.io.*;

public class vba07 {
    public static void main(String[] args) throws IOException {
        System.out.println("テストの点数を入力してください。(0で終了)");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int data;
        int total = 0;
        int count=0;

        do {
            String str = input.readLine();
            data = Integer.parseInt(str);
            total += data;
            count = count + 1;
            data++;
        } while (data != 0);
        if(count == 0){

            System.out.println("⼊⼒がありません");
        }else{
            System.out.println("平均" + total/count );
        }
        

    }
}
