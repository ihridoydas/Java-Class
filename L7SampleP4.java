
//2C 200517 リドチャンダラ

import java.io.*;

public class L7SampleP4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] test = new int[5];
        System.out.println("5人の点数を入力してください。");

        String str;
        for (int i = 0; i < 5; i++) {
            str = br.readLine();
            int num = Integer.parseInt(str);
            test[i] = num;
        }

        for (int j = 0; j < test.length - 1; j++) {
            for (int k = j + 1; k < test.length; k++) {

                if (test[j] < test[k]) {

                    int temp = test[j];
                    test[j] = test[k];
                    test[k] = temp;
                }

            }

        }

        for (int l = 0; l < test.length; l++) {

            System.out.println((l + 1) + "番目の人の点数は" + test[l] + "です。");

        }
        System.out.println("最高点は" + test[0] + "です。");

    }
}
