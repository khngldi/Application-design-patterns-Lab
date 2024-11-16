public class Plane implements IVehicle {
    private String model;
    private double speed;

    public Plane(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void drive() {
    }

    @Override
    public void zapravka() {
    }
}
