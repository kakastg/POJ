public class Auction {
    private char type;
    private String auctionName;
    private String auctionDescription;
    private double startPrice;
    private int auctionDuration;

    public Auction(char type){
        this.type=type;
    }
    public Auction Name(String auctionName){
        this.auctionName=auctionName;
        return this;
    }
    public Auction Description(String auctionDescription){
        this.auctionDescription=auctionDescription;
        return this;
    }
    public Auction PriceStart(double startPrice){
        this.startPrice=startPrice;
        return this;
    }
    public Auction Duration(int auctionDuration){
        this.auctionDuration=auctionDuration;
        return this;
    }
    public Auction build(){
        Auction auction = new Auction();
        auction.auctionDuration=this.auctionDuration;
        auction.startPrice=this.startPrice;
        auction.auctionDescription=this.auctionDescription;
        auction.auctionName=auctionName;
        auction.type = this.type;
        return auction;
    }
    private Auction(){}

    public int nextRound(){
        return auctionDuration+1;
    }
    public boolean isComplete(){
        if (auctionDuration==0)
            return true;
        else
            return false;
    }
    public String searchLogin(AuctionUser user){
        return auctionName;
    }
    public int editTrustPoints(AuctionUser user){
        int i=0;
        while (isComplete()==false){
            user.trustPoints--;
            i++;
        }
        return user.trustPoints+i+1;
    }

    public char auctionType(){
        if(type=='p'){
            auctionDuration=10;
        }else if(type=='w'){
            auctionDuration=10;
            //do dokonczenia
        }else if(type=='o'){
            auctionDuration=10;
            startPrice=this.startPrice;
            //do dokonczenia
        }
    }



}
