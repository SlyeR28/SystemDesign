package StructureDesign.StrategyPattern;

public class Stripe implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Stripe method is processing its payment....");
    }
}
