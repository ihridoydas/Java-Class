//クラス　2C（（２００５１７） 名前　リドチャンダラ　
public class vba02 {

    public static void main(String[] args) {

        int total, i;

        total = 0;
        i = 1;

        for (i = 1; i <= 50; total += i) {

            i = i + 2;
        }

        System.out.print("1～50までの偶数の合計は" + total);
    }

}
