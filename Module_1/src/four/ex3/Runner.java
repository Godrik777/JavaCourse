package four.ex3;

public class Runner {
    public static void main(String[] args) {
        MakeSound[] makeSounds = {
                new Human(),
                new Builder(),
                new Driver(),
                new Bird(),
        };

        for (MakeSound makeSound : makeSounds) {
            System.out.println(makeSound.makeSound());
        }
    }
}
