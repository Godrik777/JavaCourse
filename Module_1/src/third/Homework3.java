package third;

import third.ex1.Birch;
import third.ex1.Fir;
import third.ex1.Pine;
import third.ex1.Tree;
import third.ex3.Pyramid1;

public class Homework3 {
    public static void main(String[] args) {
        ex1();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
    }

    public static void ex1() {
        Birch birch = new Birch(2);
        birch.downFoliage();
        birch.upFoliage();
        Pine pine = new Pine(2);
        Fir fir = new Fir(3);
        double sumAge = 0;
        Tree[] trees = {birch, pine, fir};
        for (Tree tree : trees) {
            sumAge += tree.getAge();
        }
        double average = sumAge / trees.length;
        System.out.println("Средний возраст деревьев = " + average);
    }


    public static void ex3() {
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }
}

