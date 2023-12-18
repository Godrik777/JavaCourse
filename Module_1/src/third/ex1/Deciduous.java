package third.ex1;

public abstract class Deciduous extends Tree {
    private boolean foliage = true;

    public Deciduous(int age) {
        super(age);
    }

    public void downFoliage() {
        this.foliage = false;
        System.out.println("Листва опала");
    }

    public void upFoliage() {
        this.foliage = true;
        System.out.println("Листья появляются.");
    }
}
