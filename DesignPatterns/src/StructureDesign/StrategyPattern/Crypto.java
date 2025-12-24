package StructureDesign.StrategyPattern;

public class Crypto implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Crypto payment method is processing its payment....");
    }
}
