package Entity;

public class DeliverOrder extends Order {

    private String userAddress;

    public DeliverOrder() {
        this.userAddress = "";
    }

    @Override
    public String getType() {
        return "Delivery";
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}