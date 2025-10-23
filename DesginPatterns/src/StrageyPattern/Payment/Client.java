package StrageyPattern.Payment;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentContext(new CreditCardPayment("1234-5678-9999", "Rishabh Kumar"));
        paymentContext.chechOut(2500);
        paymentContext.setPaymentContext(new UpiPayment("1224375" ,"rishah@12"));
        paymentContext.chechOut(12678);
        paymentContext.setPaymentContext(new PayPal("riahba@gmail.com"));
        paymentContext.chechOut(4423);

    }
}
