public class test {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            if(i==5)
                continue;
            for(int j=1;j<=9;j++){
                System.out.print(i*j +"\t");
            }
            System.out.print("\n");
        }
    }
}
