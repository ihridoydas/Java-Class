import java.io.*;
import java.io.IOException;
public class L5Sample5 {
    public static void main(String[] args) throws IOException{
        System.out.println("整数を入力してください");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int res = Integer.parseInt(str);

        switch(res){

            case 1:
            System.out.println("１が入力されました");
            break;
            case 2:
            System.out.println("2が入力されました");
            break;
            default:
            System.out.println("１か２が入力してください");
            
        }
    }
}
