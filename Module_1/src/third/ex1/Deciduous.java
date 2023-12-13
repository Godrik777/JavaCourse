package third.ex1;

public class Deciduous extends Tree {
    protected boolean foliage;


    public Deciduous(boolean foliage, int age) {
        super(age);
        this.foliage = foliage;
    }

    public void downFoliage() {
        System.out.println("Листва опала");
    }

    public void upFoliage() {
        System.out.println("Листья появляются.");
    }
}
