package StrageyPattern.Payment;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext() {
    }

    public void  setPaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void chechOut(double amount){
        if(paymentStrategy == null){
            System.out.println("please select a payment method first .....");
        }else {
            paymentStrategy.pay(amount);
        }
    }
}
