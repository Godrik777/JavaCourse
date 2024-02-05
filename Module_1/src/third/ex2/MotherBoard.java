package third.ex2;

public class MotherBoard {
    private String name;
    private int h;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "name='" + name + '\'' +
                ", h=" + h +
                ", w=" + w +
                ", d=" + d +
                '}';
    }

    private int w;
    private int d;

    public MotherBoard(String name, int h, int w, int d) {
        this.name = name;
        this.h = h;
        this.w = w;
        this.d = d;
    }
}
