public class ExpressShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return (weight * 0.75 + distance * 0.2) + 10; // Жылдамдық үшін қосымша ақы
    }
}
