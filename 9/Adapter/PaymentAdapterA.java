public class PaymentAdapterA implements IPaymentProcessor {
    private final ExternalPaymentSystemA externalSystemA;

    public PaymentAdapterA(ExternalPaymentSystemA externalSystemA) {
        this.externalSystemA = externalSystemA;
    }

    @Override
    public void processPayment(double amount) {
        externalSystemA.makePayment(amount);
    }

    @Override
    public void refundPayment(double amount) {
        externalSystemA.makeRefund(amount);
    }
}
