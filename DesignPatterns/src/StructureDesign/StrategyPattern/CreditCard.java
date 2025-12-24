package StructureDesign.StrategyPattern;

public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("CreditCard method is processing its payment....");
    }
}
