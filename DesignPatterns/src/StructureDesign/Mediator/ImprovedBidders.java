package StructureDesign.Mediator;

public class ImprovedBidders {
    private String name;
    private double bid;

    public ImprovedBidders(String name) {
        this.name = name;
    }

    public void placeBidWithExtras(int amount , ImprovedBidders [] bidders) {
        this.bid = amount;
        System.out.println("[" + name + "] placed a bid :  " + amount);
        System.out.println("LOG : " + name + " Bid " + amount + " at " +
                System.currentTimeMillis());


        // Directly notify every other bidder with additional responsibilities

        for (ImprovedBidders b : bidders) {
            if (b != this){
                b.receiveBidWithExtras(this , amount);
            }
        }
    }

    public void receiveBidWithExtras(ImprovedBidders bidder ,double amount) {
        System.out.println("[" + name + "] is notified: " + bidder.name +
                " placed a bid of " + amount);
        System.out.println("EMAIL: Sending email to " + name +
                " about the bid from " + bidder.name);

    }

}
