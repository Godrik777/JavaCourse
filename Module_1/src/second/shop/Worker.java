package second.shop;

public class Worker {
    String name;
    int age;
    boolean gender;
    Item[] items;

    public Worker(String name, int age, Boolean gender, Item[] items) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.items = items;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(name + ": смотрите какая у меня вещь - " + item.name);
        }
    }
}


