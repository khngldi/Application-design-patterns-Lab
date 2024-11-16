public class PaymentProcessorFactory {
    public static IPaymentProcessor getPaymentProcessor(String region, String currency) {
        if ("US".equalsIgnoreCase(region) && "USD".equalsIgnoreCase(currency)) {
            return new InternalPaymentProcessor(); //внутренняя система для США
        } else if ("EU".equalsIgnoreCase(region)) {
            return new PaymentAdapterA(new ExternalPaymentSystemA()); //система A для Европы
        } else {
            return new PaymentAdapterB(new ExternalPaymentSystemB()); //система B для остальных
        }
    }
}
