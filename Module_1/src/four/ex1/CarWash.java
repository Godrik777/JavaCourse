package four.ex1;

public class CarWash {

    public double washCar(Transport transport) {
        if (transport.isClean()) {
            return 0;
        }
        double cost;
        if (transport.getLength() > 6 || transport.getHeight() > 2.5 || transport.getWidth() > 2) {
            cost = 4000;
        } else {
            cost = 2000;
        }
        transport.setClean(true);
        return cost;
    }

    public double washCar(Transport[] transports) {
        double totalCost = 0;
        for (Transport transport : transports) {
            totalCost += washCar(transport);
        }
        return totalCost;
    }
}
