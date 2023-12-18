package third.ex1;

public class Birch extends Deciduous {

    public Birch(int age) {
        super(age);
    }

    @Override
    public void upFoliage() {
        super.upFoliage();
        System.out.println("Источает аллергены");
    }
}
