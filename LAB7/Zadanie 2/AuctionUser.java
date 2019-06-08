/*
    Aleksander Mojzych
    Kacper Wieczorek
    Zadanie 2 lab7
    Implementacja Buildera z Aukcjami
     */
public class AuctionUser {
    private char type;
    private String firstName;
    private String lastName;
    private String email;
    int trustPoints;

    public AuctionUser(char type){
        this.type=type;
    }
    public AuctionUser Name(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        return this;
    }
    public AuctionUser eMail(String email){
        this.email=email;
        return this;
    }

    public AuctionUser build(){
        AuctionUser user = new AuctionUser();
        user.email = this.email;
        user.lastName = this.lastName;
        user.firstName=this.firstName;
        user.trustPoints = this.trustPoints;
        user.type = this.type;
        return user;
    }
    private AuctionUser(){}

    public String getName(){
        return firstName+" "+lastName;
    }
}
