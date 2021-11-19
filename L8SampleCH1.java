//2C ダスリドチャンダラ

class Gakusei {
    String name;
    int pg;
    int nihongo;
    int toeic;
    int mos;

    void setTen(int p, int n, int t, int m) {
        pg = p;
        nihongo = n;
        toeic = t;
        mos = m;
    }

    double avg() {
        return (double) (pg + nihongo + toeic + mos) / 4;
    }

    void setName(String n) {
        name = n;
    }

    void show() {
        System.out.println("名前は:" + name);
        System.out.println("平均点は:" + avg());
    }
}

public class L8SampleCH1 {
    public static void main(String[] args) {
        Gakusei[] meibo = new Gakusei[3];
        for (int i = 0; i < meibo.length; i++) {
            meibo[i] = new Gakusei();
        }
        meibo[0].setTen(55, 70, 65, 80);
        meibo[0].setName("yamaguchi");
        meibo[1].setTen(98, 85, 96, 87);
        meibo[1].setName("itou");
        meibo[2].setTen(90, 100, 80, 30);
        meibo[2].setName("kuroda");
        for (int i = 0; i < meibo.length; i++) {
            meibo[i].show();
        }
    }
}
