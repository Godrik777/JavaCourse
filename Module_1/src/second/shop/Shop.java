package second.shop;

public class Shop {
    Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void printWorkers() {
        for (Worker worker : workers) {
            String gender;
            if(worker.gender){
                gender = "мужчина";
            } else
                gender = "женщина";
            System.out.println(worker.name + ": " + worker.age + ", " + gender + ", список вещей: ");
            for (Item item : worker.items) {
                System.out.println(item.name + " " + item.weight + " гр.");
            }
        }
    }
}
