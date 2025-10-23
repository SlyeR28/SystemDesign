package SingleResponsiblePrinciple.Follows;

public interface DbPersistance {
    void save(ShoppingCart cart) throws InterruptedException;
    // as we are following the OPEN CLOSE PRINCIPLE
    //so for that we are using interface to add new feature in future we we can directly implement to this class
    // this will help to follow ocp
}
