package StateDesignPattern.VendingMachine;

public class SoldOutState implements VendingState {
    @Override
    public VendingState insertCoin(VendingMachine machine, int coin) {
        System.out.println("Machine is in soldOut state .Coin returned . Rs" + coin);
        return machine.getSoldOutState();
    }

    @Override
    public VendingState selectItem(VendingMachine machine) {
        System.out.println("Machine is in SoldOutState");
        return machine.getSoldOutState();
    }

    @Override
    public VendingState dispense(VendingMachine machine) {
        System.out.println("Machine is sold out!");
        return machine.getSoldOutState();
    }

    @Override
    public VendingState refundCoin(VendingMachine machine) {
        System.out.println("Machine is in sold out . NO coin inserted");
        return machine.getSoldOutState();
    }

    @Override
    public VendingState refill(VendingMachine machine, int quantity) {
        System.out.println("Refilling " + quantity);
        machine.refill(quantity);
        return machine.getNoCoinState();
    }

    @Override
    public String getState() {
        return "Sold Out";
    }
}
