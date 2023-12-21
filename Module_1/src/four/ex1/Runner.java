package four.ex1;

public class Runner {
    public static void main(String[] args) {
        Transport[] transports = {
                new Car(false, 5, 2, 1.8, false),
                new Car(false, 5, 2, 1.8, false),
                new Car(false, 5, 2, 1.8, false),
                new Car(false, 5, 2, 1.8, false),
                new Bus(false, 12, 3, 2.3, 30),
                new Bus(false, 12, 3, 2.3, 30),
                new Bus(false, 12, 3, 2.3, 30),
                new Bus(false, 12, 3, 2.3, 30),
                new Bus(false, 12, 3, 2.3, 30)
        };

        double carWashCost = CarWash.washCar(transports);
        System.out.println("Мэрия заплатит " + carWashCost + " рублей за мойку машин.");
    }
}

