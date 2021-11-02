class Car {

    void show() {

        System.out.println("車のナンバーは" + num + "です");

        System.out.println("ガソリンは" + gas + "です");
    }

    int num;
    double gas;

    void setNum(int n) {
        num = n;
        System.out.println("ナンバーを" + num + "にしました");
    }

    void setGas(double g) {
        gas = g;
        System.out.println("ナンバーを" + gas + "にしました");
    }


    int getNum() {

        System.out.println("ナンバーを調べました");
        return num;
    }

    double getGas() {

        System.out.println("ナンバーを調べました");
        return gas;
    }

}