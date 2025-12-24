package StructureDesign.Mediator;

public class AuctionUglyDemo {
    public static void main(String[] args) {
        ImprovedBidders bidder1 = new ImprovedBidders("Alice");
        ImprovedBidders bidder2 = new ImprovedBidders("Bob");
        ImprovedBidders bidder3 = new ImprovedBidders("Carl");
        ImprovedBidders [] bidders = {bidder1, bidder2, bidder3};

        bidder1.placeBidWithExtras(100 , bidders);
        bidder2.placeBidWithExtras(300 , bidders);
        bidder3.placeBidWithExtras(200 , bidders);
    }
}
