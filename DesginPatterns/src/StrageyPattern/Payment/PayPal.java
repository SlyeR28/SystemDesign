package StrageyPattern.Payment;

public class PayPal implements  PaymentStrategy{

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹ " + amount + "Using PayPal ( " +email + ")");
    }
}
