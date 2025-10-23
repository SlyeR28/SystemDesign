package StrageyPattern.Payment;

public class UpiPayment implements PaymentStrategy {
    private String phoneNumber;
    private String upihandler;

    public UpiPayment(String phoneNumber, String upihandler) {
        this.phoneNumber = phoneNumber;
        this.upihandler = upihandler;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹ " + amount + "Using upi  ( " + phoneNumber + upihandler + ")");
    }
}
