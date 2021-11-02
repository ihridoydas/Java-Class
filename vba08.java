import java.io.*;
public class vba08 {
     public static void main(String[] args)  throws IOException 
        {
            int n, max, min;
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String str = input.readLine();
            n = Integer.parseInt(str);
            System.out.print("Enter number of elements in the array:");
         
            int a[] = new int[n];
            System.out.println("Enter elements of array:");
            for(int i = 0; i < n; i++)
            {
                a[i] = str.length();
            }
            max = a[0];

            for(int i = 0; i < n; i++){
                if(max < a[i])
                {
                    max = a[i];
                }
            }
            min = max;
            for(int i = 0; i < n; i++){
                if(min > a[i])
                {
                    min = a[i];
                }
            }
            System.out.println("Maximum value:"+max);
            System.out.println("Maximum value:"+min);
        }


  }