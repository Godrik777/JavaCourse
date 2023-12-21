package four.ex2;

public class Runner {
    public static void main(String[] args) {
        Flyable[] flyables = {
                new Duck(false),
                new Duck(true),
                new Airplane(10),
                new Airplane(-1)
        };

        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
