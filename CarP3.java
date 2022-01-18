public class CarP3 {

    public String name;
    public int pos;

    public CarP3() {

        name = "";
        pos = 0;

    }

    public void setData(int x) {

        if (x > 0) {

            pos = x;

        } else if (x <= 0) {

            pos = 0;
        }
    }

    public void setData(String n) {

    }

    public void setData(int x, String n) {

        setData(x);
        name = n;

    }

    public int getPos() {

        return pos;

    }

    public String getName() {

        return name;

    }
}
