package StateDesignPattern.VendingMachine;

public class DispenseState implements VendingState {
    @Override
    public VendingState dispense(VendingMachine machine) {
        System.out.println("Item dispensed ! ");
        machine.decrementItemCount();

        if(machine.getItemCount() > 0){
            return machine.getNoCoinState();
        }else {
            System.out.println("Machine is in sold out state");
            return machine.getSoldOutState();
        }
    }

    @Override
    public String getState() {
        return "Dispensing";
    }

    @Override
    public VendingState insertCoin(VendingMachine machine, int coin) {
        System.out.println("please wait , already dispensing item , Coin returned : Rs" + coin);
        return machine.getDespenseState();
    }

    @Override
    public VendingState refill(VendingMachine machine, int quantity) {
        System.out.println("Can't refill in this state");
        return machine.getDespenseState();
    }

    @Override
    public VendingState refundCoin(VendingMachine machine) {
        System.out.println("Can't refund in this state");
        return machine.getDespenseState();
    }

    @Override
    public VendingState selectItem(VendingMachine machine) {
        System.out.println("Can't select in this state");
        return machine.getDespenseState();
    }
}
