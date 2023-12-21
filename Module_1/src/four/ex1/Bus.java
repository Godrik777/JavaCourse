package four.ex1;

public class Bus extends Transport {
    private int maxPassengers;

    public Bus(boolean clean, double width, double height, double length, int maxPassengers) {
        super(clean, width, height, length);
        this.maxPassengers = maxPassengers;
    }


    public int getMaxPassengers() {
        return maxPassengers;
    }
}
