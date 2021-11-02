public class L4Sample5 {
  public static void main(String[] args) {
    int a=0;
    int b=0;
    b=a++;
    System.out.println("代入後にインクリメントしたのでbの値は"+b+"です。");
    a=2<<5;
    b=50>>2;
    System.out.println(a);
    System.out.println(b);

  /*   a=(3+4)<<(5-1);
    b=100>>2;
    System.out.println(a);
    System.out.println(b); */
}
}
