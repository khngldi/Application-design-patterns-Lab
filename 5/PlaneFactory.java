public class PlaneFactory extends VehicleFactory {
    private String model;
    private double speed;

    public PlaneFactory(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public IVehicle createVehicle() {
        return new Plane(model, speed);
    }
}