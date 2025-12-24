package StructureDesign.Mediator;

public class Bidder {
    private String name;
    private double bid;

    public Bidder(String name) {
        this.name = name;
    }
    public void placeBid(double amount , Bidder[] bidders){
        this.bid = amount;
        System.out.println(name+" placed a bid : " +amount);
        for(Bidder bidder : bidders){
            if(bidder != this){
                bidder.receiveBid(this , amount);
            }

        }
    }
    public void receiveBid(Bidder bidder , double amount){
        System.out.println(name + "is notified : " + bidder.name + "place a bid of amount : " + amount);
    }
}
