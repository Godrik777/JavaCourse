package hm2.ex1;

import java.util.ArrayList;
import java.util.List;

public class BaggageCompartment {
    private List<Suitcase> suitcases;
    private List<Worker> workers;

    public BaggageCompartment() {
        this.suitcases = new ArrayList<>();
        this.workers = new ArrayList<>();
        workers.add(new Worker("Worker 1"));
        workers.add(new Worker("Worker 2"));
        workers.add(new Worker("Worker 3"));
    }

    public void flightArrival(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            Suitcase suitcase = new Suitcase(flightNumber);
            suitcases.add(suitcase);
        }
    }

    public void unloadBaggage() {
        for (int i = 0; i < 20; i++) {
            for (Worker worker : workers) {
                worker.throwSuitcase(suitcases.subList(i, i+1));
            }
        }
    }
}
