package StateDesignPattern.VendingMachine;

public class HasCoinState implements VendingState{


    @Override
    public VendingState insertCoin(VendingMachine machine, int coin) {
        machine.addCoin(coin);
        System.out.println("Additional coin inserted. Current Balance : Rs " +machine.getInsertedCoins());
        return machine.getHasCoinState();
    }

    @Override
    public VendingState selectItem(VendingMachine machine) {
        if(machine.getInsertedCoins() >= machine.getPrice()){
            System.out.println("Item selected . Dispensing.....");

            int change = machine.getInsertedCoins() - machine.getPrice();
            if (change > 0){
                System.out.println("Change returned : Rs " + change);
            }
            machine.setInsertedCoins(0);
            return machine.getDespenseState();
        }else{
            int needed = machine.getPrice() -  machine.getInsertedCoins();
            System.out.println("Needed : Rs " + needed);
            return machine.getHasCoinState();
        }
    }

    @Override
    public VendingState dispense(VendingMachine machine) {
        System.out.println("Please select an item first");
        return machine.getHasCoinState();
    }

    @Override
    public VendingState refundCoin(VendingMachine machine) {
        System.out.println("Coin Returned : Rs " + machine.getInsertedCoins());
        machine.setInsertedCoins(0);
        return machine.getNoCoinState();
    }

    @Override
    public VendingState refill(VendingMachine machine, int quantity) {
        System.out.println("can't refill in this state");
        return machine.getHasCoinState();
    }

    @Override
    public String getState() {
        return "Has Coin    ";
    }
}
