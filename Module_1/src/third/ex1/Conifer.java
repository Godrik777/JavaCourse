package third.ex1;

public class Conifer extends Tree {
    protected String needles;

    public Conifer(int age, String needles) {
        super(age);
        this.needles = needles;
    }

    public String getNeedles() {
        return needles;
    }
}
