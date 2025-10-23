package Strategies;

public class UpiPayment implements PaymentStrategy {

    private String mobile;

    public UpiPayment(String mob) {
        this.mobile = mob;
    }


    @Override
    public void Pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI (" + mobile + ")");
    }
}
