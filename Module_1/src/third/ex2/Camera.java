package third.ex2;

public class Camera {
    private int zoom;

    @Override
    public String toString() {
        return "Camera{" +
                "zoom=" + zoom +
                '}';
    }

    public Camera(int zoom) {
        this.zoom = zoom;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }
}
