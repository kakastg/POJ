/*
    Aleksander Mojzych
    Kacper Wieczorek
    Zadanie 2 lab7
    Implementacja Buildera z Aukcjami
     */
public class Auction {
    char type;
    String auctionName;
    String auctionDescription;
    double startPrice;
    int auctionDuration;
    AuctionUser auctionuser;

    public Auction(char type) {
        this.type = type;
    }

    public Auction Name(String auctionName) {
        this.auctionName = auctionName;
        return this;
    }

    public Auction Description(String auctionDescription) {
        this.auctionDescription = auctionDescription;
        return this;
    }

    public Auction PriceStart(double startPrice) {
        this.startPrice = startPrice;
        return this;
    }

    public Auction Duration(int auctionDuration) {
        this.auctionDuration = auctionDuration;
        return this;
    }
    public Auction addingUser(AuctionUser auctionuser){
        this.auctionuser=auctionuser;
        return this;
    }

    public Auction build() {
        Auction auction = new Auction();
        auction.auctionuser = this.auctionuser;
        auction.auctionDuration = this.auctionDuration;
        auction.startPrice = this.startPrice;
        auction.auctionDescription = this.auctionDescription;
        auction.auctionName = auctionName;
        auction.type = this.type;
        return auction;
    }

    private Auction() {
    }

    public int nextRound() {
        return auctionDuration + 1;
    }

    public boolean isComplete() {
        if (auctionDuration == 0)
            return true;
        else
            return false;
    }

    public String searchLogin(AuctionUser user) {
        return auctionName;
    }

    public int editTrustPoints(AuctionUser user) {
        int i = 0;
        while (!isComplete()) {
            user.trustPoints--;
            i++;
        }
        return user.trustPoints + i + 1;
    }
    public double amountPaid(double amount){
        return startPrice+amount;
    }
    public String auctionWon(AuctionUser user){
        return user.getName();
    }
    public boolean isAuctioned(){
        if(!isComplete())
            return true;
        else
            return false;
    }
}
