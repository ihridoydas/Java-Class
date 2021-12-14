public class CarP2 {
    
    public int tire;
    public String color;


    public static int sum=0;
    public CarP2(){

        tire = 4;
        color= "white";

        sum++;

    }
    public void show(){

        System.out.println("タイヤ:"+ tire + "\t色:"+color);

    }

    public static void carSum(){

        System.out.println("車："+ sum + "台");


    }





}
