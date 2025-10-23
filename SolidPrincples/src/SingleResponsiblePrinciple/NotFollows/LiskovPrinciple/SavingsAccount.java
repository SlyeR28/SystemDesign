package SingleResponsiblePrinciple.NotFollows.LiskovPrinciple;

public class SavingsAccount implements Account{

    private double balance = 1000;


    @Override
    public void withdrawAmount(double amount) {
        if(amount <= balance){
            System.out.println("withdraw" +amount);
            balance -= amount;
            System.out.println(balance);
        }
    }

    @Override
    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("updated balance is " + balance);
    }
}
