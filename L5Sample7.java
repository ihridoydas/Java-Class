import java.io.*;

public class L5Sample7 {

    public static void main(String[] args) throws IOException {
        System.out.println("あなたは男性ですか");
        System.out.println("YまたNをに入力してください");
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        String str = Br.readLine();
        char res = str.charAt(0);
        if (res == 'Y' || res == 'y') {

            System.out.println("あなたは男性ですね");
        } else if (res == 'N' || res == 'n') {

            System.out.println("あなたは女性ですね");
        } else {

            System.out.println("YまたNをに入力してください");

        }
    }
}
