package hm2.ex1;

import java.util.List;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwSuitcase(List<Suitcase> suitcases) {
        for (Suitcase suitcase : suitcases) {
            System.out.println(name + ": Мужики, кидаю чемодан " + suitcase.getFlightNumber());
            break;
        }
    }
}
