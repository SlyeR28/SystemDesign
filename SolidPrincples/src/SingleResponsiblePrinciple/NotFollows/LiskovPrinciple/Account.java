package SingleResponsiblePrinciple.NotFollows.LiskovPrinciple;

public interface Account {

    void withdrawAmount(double amount) throws Exception;
    void depositAmount(double amount);

}
