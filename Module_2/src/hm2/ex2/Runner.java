package hm2.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        Map<Item, Integer> items = new HashMap<>();

        Item item1 = new Item("Яблоко");
        Item item2 = new Item("Банан");
        Item item3 = new Item("Апельсин");

        items.put(item1, 1);
        items.put(item2, 2);
        items.put(item3, 3);

        System.out.println(items.get(new Item("Апельсин")));
    }
}
