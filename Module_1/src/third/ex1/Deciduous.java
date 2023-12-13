package third.ex1;

public class Deciduous extends Tree {
    private boolean foliage;
    private boolean allergo;

    public Deciduous(boolean foliage, int age, boolean allergo) {
        super(age);
        this.foliage = foliage;
        this.allergo = allergo;

    }

    public void downFoliage() {
        if (foliage) {
            foliage = false;
            System.out.println("Листва опала");
        } else {
            System.out.println("Листья еще не появились");
        }
    }

    public void upFoliage() {
        if (!foliage && allergo) {
            foliage = true;
            System.out.println("Листья появляются. Источают аллергены");
        } else if (!foliage) {
            foliage = true;
            System.out.println("Листья появляются.");
        } else {
            System.out.println("Листья еще не опали");
        }
    }
}
