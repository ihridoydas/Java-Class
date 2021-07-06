
//200517　2C リドチャンダラ
import java.io.*;

public class L5SampleP5 {

    public static void main(String[] args) throws IOException {

        System.out.println("成績を入力してください");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        int num = Integer.parseInt(number);

        switch (num) {
        case 1:
            System.out.println("もっと頑張りましょう");
            break;

        case 2:
            System.out.println("もう少し頑張りましょう");
            break;
        case 3:
            System.out.println("さらに上にめざしましょう");
            break;
        case 4:
            System.out.println("たいへんよくできました");
            break;
        case 5:
            System.out.println("たいへん優秀です");
            break;

        default:

        }

    }
}
