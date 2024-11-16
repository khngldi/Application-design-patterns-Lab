public class DeliveryContext {
    private IShippingStrategy shippingStrategy;

    //Жеткізу стратегиясын орындау
    public void setShippingStrategy(IShippingStrategy strategy) {
        this.shippingStrategy = strategy;
    }

    //Жеткізу бағасы
    public double calculateCost(double weight, double distance) {
        if (shippingStrategy == null) {
            throw new IllegalStateException("Стратегия доставки не установлена.");
        }
        if (weight <= 0 || distance <= 0) {
            throw new IllegalArgumentException("Вес и расстояние должны быть положительными числами.");
        }
        return shippingStrategy.calculateShippingCost(weight, distance);
    }
}
