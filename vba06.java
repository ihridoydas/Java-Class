
import java.io.*;

public class vba06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word=br.readLine();
        //String word = "meisei";
        int count = 0;
        while (!word.equals("meisei") && count <= 2) {
            System.out.println(count);
            count++;
            word=br.readLine();
        }
        if (count == 3) {
            System.out.println("不正アクセス");
        } else {
            System.out.println("ログイン成功");
        }

    }
}
