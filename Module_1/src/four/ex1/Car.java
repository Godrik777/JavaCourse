package four.ex1;

public class Car extends Transport {
    private boolean cruiseControl;

    public Car(boolean clean, double width, double height, double length, boolean cruiseControl) {
        super(clean, width, height, length);
        this.cruiseControl = cruiseControl;
    }

    public boolean hasCruiseControl() {
        return cruiseControl;
    }
}
