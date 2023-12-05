package second.shop;

public class Shop {
    Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void printWorkers() {
        for (Worker worker : workers) {
            System.out.println(worker.name + ": " + worker.age + ", " + worker.gender + ", список вещей: ");
            for (Item item : worker.items) {
                System.out.println(item.name + " " + item.weight + " гр.");
            }
        }
    }
}
