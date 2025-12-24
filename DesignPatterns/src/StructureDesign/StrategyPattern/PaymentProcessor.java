package StructureDesign.StrategyPattern;

public class PaymentProcessor {

    public void processPayment(String paymentMethod) {
        if(paymentMethod.equalsIgnoreCase("Credit card")){
            // Process credit card
            System.out.println("Processing Credit Card Payment.....");
        } else if (paymentMethod.equalsIgnoreCase("Paypal")) {
            //process PayPal payment
            System.out.println("Processing Paypal Payment.....");
        }else if (paymentMethod.equalsIgnoreCase("Crypto")){
            //process crypto
            System.out.println("Processing Crypto Payment.....");
        } else if (paymentMethod.equalsIgnoreCase("Stripe")) {
            // process Stripe payment
            System.out.println("Processing Stripe Payment.....");
        }else {
            throw new IllegalArgumentException("Invalid Payment Method");
        }


    }
}
