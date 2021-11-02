//200517 ダスリドチャンダラ
import java.io.*;

public class L3SampleP3 {

    public static void main(String[] args) throws IOException {

        System.out.println("あなたは何歳ですか");
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        String old = Br.readLine();

        int intold = Integer.parseInt(old);

        System.out.println("あなたは" + intold + "歳です");
    }
}
