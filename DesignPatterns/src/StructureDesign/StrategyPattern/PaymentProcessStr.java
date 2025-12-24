package StructureDesign.StrategyPattern;

public class PaymentProcessStr {
    private PaymentMethod paymentMethod;

    public PaymentProcessStr(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        paymentMethod.processPayment();
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
