public class InternationalShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight * 1.0 + distance * 0.5 + 15; //Таможнялық сборлар
    }
}
