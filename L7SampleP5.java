
import java.io.*;
public class L7SampleP5 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       
        System.out.println("5人の点数を入力してください。");

        String str;
        
            str = br.readLine();
            Long num = Long.parseLong(str);
            
            
          System.out.println(num);
        }

    }
    
    

