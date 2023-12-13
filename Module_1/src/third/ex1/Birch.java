package third.ex1;

public class Birch extends Deciduous{

    public Birch(boolean foliage, int age) {
        super(foliage, age);
    }

    @Override
    public void upFoliage() {
        super.upFoliage();
        System.out.println("Источает аллергены");
    }
}
