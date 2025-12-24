package StateDesignPattern.VendingMachine;

public class NoCoinState implements VendingState {
    @Override
    public VendingState insertCoin(VendingMachine machine, int coin) {
        machine.setInsertedCoins(coin);
        System.out.println("Coin inserted. current balance Rs :  " + coin);
        return machine.getHasCoinState();
    }

    @Override
    public VendingState selectItem(VendingMachine machine) {
        System.out.println("Please insert coin first");
        return machine.getNoCoinState(); // stay in same state
    }

    @Override
    public VendingState dispense(VendingMachine machine) {
        System.out.println("Please insert coin first and select item first");
        return machine.getHasCoinState();
    }

    @Override
    public VendingState refundCoin(VendingMachine machine) {
        System.out.println("No coin to refund");
        return machine.getNoCoinState();
    }

    @Override
    public VendingState refill(VendingMachine machine, int quantity) {
        System.out.println("Item refilling.....");
        machine.increaseItemCount(quantity);
        return machine.getNoCoinState();
    }

    @Override
    public String getState() {
        return "No Coin";
    }
}
