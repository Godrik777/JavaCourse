package third.ex2;

public class Fabric {
    public void doPhone(Iphone iphone15){
        iphone15.setMotherBoard(new MotherBoard("7uik", 15, 12, 13));
        iphone15.setCamera(new Camera(20));
        iphone15.setOpeartionSystem(new OpeartionSystem("Ios"));
    }

    public void doSamsung(Samsung samsungGalaxy){
        samsungGalaxy.setMotherBoard(new MotherBoard("j-108", 10, 12, 13));
        samsungGalaxy.setCamera(new Camera(15));
        samsungGalaxy.setOpeartionSystem(new OpeartionSystem("Android"));
    }

}
