//200517 ダスリドチャンダラ
import java.io.*;

public class L3SampleP4 {

    public static void main(String[] args) throws IOException {
        System.out.println("円周率の値はいくつですか？");
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        String data = Br.readLine();

        double doubleData = Double.parseDouble(data);

        System.out.println("円周率の値" + doubleData + "です");
    }
}
