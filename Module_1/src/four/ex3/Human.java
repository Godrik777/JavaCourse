package four.ex3;

public class Human implements MakeSound {
    public Human() {
    }

    @Override
    public String makeSound() {
        return "Я человек";
    }
}
