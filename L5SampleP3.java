
//200517　2C リドチャンダラ
import java.io.*;

public class L5SampleP3 {

    public static void main(String[] args) throws IOException {

        System.out.println("２つの整数を入力してください");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstNumber = br.readLine();
        String secondNumber = br.readLine();

        int numberOne = Integer.parseInt(firstNumber);
        int numberTwo = Integer.parseInt(secondNumber);

        if (numberOne == numberTwo) {
            System.out.println("２つの数は同じです");
        } else if (numberOne >= numberTwo) {

            System.out.println(numberOne + "の方が大きいです");
        } else if (numberOne <= numberTwo) {

            System.out.println(numberTwo + "の方が大きいです");
        } else {

            System.out.println("エラー");
        }

    }
}
