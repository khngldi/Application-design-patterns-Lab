public class Main2 {
    public static void main(String[] args) {
        IPaymentProcessor usProcessor = PaymentProcessorFactory.getPaymentProcessor("US", "USD");
        usProcessor.processPayment(100.0);
        usProcessor.refundPayment(50.0);

        IPaymentProcessor euProcessor = PaymentProcessorFactory.getPaymentProcessor("EU", "EUR");
        euProcessor.processPayment(200.0);
        euProcessor.refundPayment(100.0);

        IPaymentProcessor globalProcessor = PaymentProcessorFactory.getPaymentProcessor("Asia", "INR");
        globalProcessor.processPayment(300.0);
        globalProcessor.refundPayment(150.0);
    }
}
