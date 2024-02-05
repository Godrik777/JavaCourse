package third.ex2;

public class Runner {
    public static void main(String[] args) {
        Fabric fabric = new Fabric();
        Iphone iphone15 = new Iphone();
        Samsung samsungGalaxy = new Samsung();

        fabric.doPhone(iphone15);
        fabric.doSamsung(samsungGalaxy);

        System.out.println(iphone15);
        System.out.println(samsungGalaxy);
    }

}
