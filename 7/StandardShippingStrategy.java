public class StandardShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight * 0.5 + distance * 0.1;
    }
}
