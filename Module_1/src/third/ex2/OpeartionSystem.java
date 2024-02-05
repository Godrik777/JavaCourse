package third.ex2;

public class OpeartionSystem {
    private String name;

    public OpeartionSystem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OpeartionSystem{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
