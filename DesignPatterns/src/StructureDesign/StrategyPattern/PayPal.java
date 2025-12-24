package StructureDesign.StrategyPattern;

public class PayPal implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("PayPal method is processing its payment....");
    }
}
