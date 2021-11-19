//2C ダスリドチャンダラ

class Test {
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
}

public class L8SampleP3 {
    public static void main(String[] args) {
        Test yamaguchi = new Test();
        Test itou = new Test();
        yamaguchi.setTen(55, 70, 65, 80);
        itou.setTen(98, 85, 96, 87);
        System.out.println("山口の平均点は" + yamaguchi.avg());
        System.out.println("伊藤の平均点は" + itou.avg());
    }
}
