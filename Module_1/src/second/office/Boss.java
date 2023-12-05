package second.office;

public class Boss {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public void bossRage(Manager manager) {
        System.out.println(manager.name + " быстрее!");

    }
}
