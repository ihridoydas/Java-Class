import java.io.BufferedReader;
import java.io.IOException;
import java.lang.ref.Cleaner;
import java.io.*;


public class L3Sample4 {
    
    public static void main(String[] args) throws IOException{

        System.out.println("整数を入れてください。");
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        String str = Br.readLine();

        //ここから

        int num = Integer.parseInt(str);

        System.out.println(num + "入れされました");


        
    }
}
