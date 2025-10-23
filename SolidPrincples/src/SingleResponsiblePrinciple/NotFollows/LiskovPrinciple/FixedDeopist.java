package SingleResponsiblePrinciple.NotFollows.LiskovPrinciple;

public class FixedDeopist implements Account{

    private double balanace = 2000;


    @Override
    public void withdrawAmount(double amount) throws Exception {
        System.out.println("we can not  withdraw ");
          throw  new Exception(amount + " can not be withdraw");
    }

    @Override
    public void depositAmount(double amount) {
         balanace += amount;
        System.out.println("updated balance is " +balanace);
    }
}
