package StructuralDesign.ChainOfRes.BankDispenser;

public abstract class MoneyHandler {

    protected MoneyHandler nextHnadler;

    public MoneyHandler() {
        this.nextHnadler = null;
    }


    public void setNextHnadler(MoneyHandler next) {
        this.nextHnadler = next;
    }

    public abstract void dispense(double amount);

}
