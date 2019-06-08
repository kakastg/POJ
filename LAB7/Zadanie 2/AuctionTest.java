/*
    Aleksander Mojzych
    Kacper Wieczorek
    Zadanie 2 lab7
    Implementacja Buildera z Aukcjami
     */
     public class AuctionTest {

    public static void main (String[] args){
        AuctionUser user = new AuctionUser('s')
                .Name("Kacper", "Wieczorek")
                .eMail("kakastg9@gmail.com")
                .build();
        Auction auction = new Auction('p')
                .Description("Rower")
                .Duration(5)
                .Name("Sprzedam rower")
                .PriceStart(25.0d)
                .addingUser(user)
                .build();
        if(auction.type=='p'){
            if(auction.auctionDuration==0){
                auction.auctionWon(user);
            }
        }else if(auction.type=='w'){
            if(auction.auctionDuration==0){
                auction.auctionWon(user);
                auction.auctionDuration+=1;
            }
        }else if(auction.type=='o'){
            if(auction.isAuctioned()){
                auction.startPrice-=1;
                System.out.println(auction.startPrice);
            }
        }
    }
}
