public class NightShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return (weight * 0.6 + distance * 0.15) + 20; //Шұғылдық(срочный) үшін қосымша ақы
    }
}
