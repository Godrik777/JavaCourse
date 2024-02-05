package hm2.ex3;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<Detail, Integer> details = new HashMap<>();

        Detail detail1 = new Detail("Пила");
        Detail detail2 = new Detail("Молоток");
        Detail detail3 = new Detail("Отвертка");

        details.put(detail1, 1);
        details.put(detail2, 2);
        details.put(detail3, 3);

        for (Detail detail : details.keySet()) {
            System.out.println(detail.getName() + " - " + details.get(detail));
        }
    }
}
