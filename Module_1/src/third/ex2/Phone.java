package third.ex2;

public class Phone {
    private String name;
    private Camera camera;
    private MotherBoard motherBoard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", camera=" + camera +
                ", motherBoard=" + motherBoard +
                ", opeartionSystem=" + opeartionSystem +
                '}';
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public OpeartionSystem getOpeartionSystem() {
        return opeartionSystem;
    }

    public void setOpeartionSystem(OpeartionSystem opeartionSystem) {
        this.opeartionSystem = opeartionSystem;
    }

    private OpeartionSystem opeartionSystem;

    public Phone(String name) {
        this.name = name;
    }
}
