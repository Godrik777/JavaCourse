package second.shop;

public class Runner {
    public static void main(String[] args) {
        Item hamer = new Item(1000, "Молот");
        Item screwdriver = new Item(50, "Отвертка");
        Item notebook = new Item(30, "Тетрадь");
        Item pen = new Item(10, "Ручка");
        Item[] vasilyItems = {hamer, screwdriver};
        Item[] maryanaItems = {notebook, pen};

        Worker vasily = new Worker("Василий", 30, true, vasilyItems);
        Worker maryana = new Worker("Марьяна", 25, false, maryanaItems);
        Worker[] workers = {vasily, maryana};

        Shop shop = new Shop(workers);
        shop.printWorkers();
        vasily.showItems();
        maryana.showItems();
    }
}
