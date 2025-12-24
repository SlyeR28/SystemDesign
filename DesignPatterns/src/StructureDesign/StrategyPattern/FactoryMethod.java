package StructureDesign.StrategyPattern;

public class FactoryMethod {
    public void processPayment(String paymentType) {
        if (paymentType.equalsIgnoreCase("CreditCard")) {
            CreditCard creditCard = new CreditCard();
            creditCard.processPayment();
        }else if (paymentType.equalsIgnoreCase("PayPal")) {
            PayPal payPal = new PayPal();
            payPal.processPayment();
        }else if (paymentType.equalsIgnoreCase("Stripe")) {
            Stripe stripe = new Stripe();
            stripe.processPayment();
        } else if (paymentType.equalsIgnoreCase("Crypto")) {
            Crypto crypto = new Crypto();
            crypto.processPayment();
        }else {
            System.out.println("Payment method doest not support.....");
        }

    }
}
