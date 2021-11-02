import java.io.*;
public class L5Sample2 {

    public static void main(String[] args) throws Exception {
        System.out.println("整数を入力してください");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int res = Integer.parseInt(str);
        if (res == 1) {
            System.out.println("１が入力されました");
    

            
        } else if (res == 2) {

            System.out.println("2 が入力されました");

        } else {

            System.out.println("１か２が入力してください");
        }

    }
}
