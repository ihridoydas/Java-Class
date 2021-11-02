//200517 ダスリドチャンダラ
import java.io.*;

public class L3SampleP5 {

    public static void main(String[] args) throws IOException {

        System.out.println("身長と体重を入力してください");
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        String sttall = Br.readLine();
        String taijuu = Br.readLine();

        double dbtoll = Double.parseDouble(sttall);

        double dbtaijuu = Double.parseDouble(taijuu);

        System.out.println("身長は" + dbtoll + "センチです");
        System.out.println("体重は" + dbtaijuu + "キロです");
    }
}
