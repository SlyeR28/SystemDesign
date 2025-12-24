package StructureDesign.StrategyPattern;

public class Test {
    public static void main(String[] args) {
//        FactoryMethod factoryMethod = new FactoryMethod();
//        factoryMethod.processPayment("CreditCard");

        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payapl = new PayPal();
        PaymentMethod crypro = new Crypto();
        PaymentMethod stripe = new Stripe();

        PaymentProcessStr paymentProcessStr = new PaymentProcessStr(creditCard);
        PaymentProcessStr paymentProcessStr1 = new PaymentProcessStr(payapl);
        PaymentProcessStr paymentProcessStr2 = new PaymentProcessStr(crypro);
        PaymentProcessStr paymentProcessStr3 = new PaymentProcessStr(stripe);
        paymentProcessStr.processPayment();
        paymentProcessStr1.processPayment();
        paymentProcessStr2.processPayment();
        paymentProcessStr3.processPayment();


    }
}
