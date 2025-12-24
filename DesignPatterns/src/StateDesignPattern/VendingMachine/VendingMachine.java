package StateDesignPattern.VendingMachine;

public class VendingMachine {
    private VendingState currentState;
    private int itemCount;
    private int itemPrice;
    private int insertedCoins;

    private VendingState noCoinState;
    private VendingState hasCoinState;
    private VendingState despenseState;
    private VendingState soldOutState;

    public VendingMachine(int itemCount, int itemPrice) {
        this.itemCount = itemCount;
        this.itemPrice = itemPrice;
        this.insertedCoins = 0;

        // state objects
        NoCoinState noCoinState = new NoCoinState();
        HasCoinState hasCoinState = new HasCoinState();
        DispenseState dispenseState = new DispenseState();
        SoldOutState soldOutState = new SoldOutState();

        if(itemCount > 0){
            currentState = noCoinState;
        }else {
            currentState = soldOutState;
        }
    }

    // Print the status of Vending Machine
    public void printStatus() {
        System.out.println("\n--- Vending Machine Status ---");
        System.out.println("Items remaining: " + itemCount);
        System.out.println("Inserted coin: Rs " + insertedCoins);
        System.out.println("Current state: " + currentState.getState() + "\n");
    }

    public void insertCoin(int coin) {
        currentState = currentState.insertCoin(this, coin);
    }
    public void selectItem(){
        currentState  = currentState.selectItem(this);
    }
    public void dispense(){
        currentState = currentState.dispense(this);
    }
    public void returnCoin(){
        currentState = currentState.refundCoin(this);
    }
    public void refill(int quantity){
        currentState = currentState.refill(this, quantity);
    }

    // getter and setter
    public VendingState getNoCoinState() {
        return noCoinState;
    }


    public VendingState getHasCoinState() {
        return hasCoinState;
    }

    public VendingState getDespenseState() {
        return despenseState;
    }

    public VendingState getSoldOutState() {
        return soldOutState;
    }

   // data access Methods
    public int getItemCount() {
        return itemCount;
    }

    public void decrementItemCount(){
        itemCount--;
    }

    public void increaseItemCount(int count){
        itemCount +=  count;
    }
    public int getInsertedCoins(){
        return insertedCoins;
    }

    public void setInsertedCoins(int coin){
        this.insertedCoins = coin;
    }
    public void addCoin(int coin){
        insertedCoins +=coin;
    }
    public int getPrice(){
        return this.itemPrice;
    }

    public void setPrice(int itemPrice){
        this.itemPrice = itemPrice;
    }


    public String getState() {
        return "NO_COIN";
    }

}
