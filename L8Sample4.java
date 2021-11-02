class MainCar{
int num;
double gas;
void setNum(int n){
    num =n;
    System.out.println("ナンバーを"+num +"にしました");
}
void setGas(double g) {
    gas=g;
    System.out.println("ガソリン代"+ gas +"にしました");
}

void show(){
    System.out.println("車のナンバーを"+num +"にしました");
    System.out.println("ガソリン"+gas +"にしました");
}

}





public class L8Sample4 {
    
    public static void main(String[] args) {
        
     MainCar car1 = new MainCar();

    car1.setNum(1234);
    car1.setGas(20.5);
    
    }

}
