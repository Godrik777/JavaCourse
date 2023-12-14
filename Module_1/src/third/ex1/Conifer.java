package third.ex1;

public abstract class Conifer extends Tree {
    protected String needles;


    public Conifer(int age, String needles) {
        super(age);
        this.needles = needles;
    }
}
