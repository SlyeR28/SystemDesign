package StrageyPattern.Payment;

public class CreditCardPayment implements PaymentStrategy{
    private String CardNumber;
    private String cardHolder;

    public CreditCardPayment(  String cardNumber ,String cardHolder) {
        CardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹ " + amount + "Using Credit Card ( " + cardHolder + ")");
    }
}
