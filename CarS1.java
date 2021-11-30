class CarS1{

    private int num;
    private double gas;
    public void setNumGas(int n,double g){
        if(g>0 && g<1000){
            num= n;
            gas = g;

        }else{
              System.out.println(g + ":error");
        }
    }
    public void show(){
          System.out.println("num:" +num);
             System.out.println("gas:" + gas);
    }
}