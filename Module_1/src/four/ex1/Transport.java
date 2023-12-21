package four.ex1;

public abstract class Transport {
    private boolean clean;
    private double width;
    private double height;
    private double length;

    public Transport(boolean clean, double width, double height, double length) {
        this.clean = clean;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}
