package four.ex2;

public class Airplane implements Flyable {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("пассажиров в самолете меньше 0");
        } else {
            System.out.println("самолет летит");
        }
    }
}

