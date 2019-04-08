/*
Aleksander Tyński
Kacper Wieczorek
Zadanie 3 lab3
Tworzenie klasy Account
 */
public class Account {
    private int id;
    private String name;
    private int balance;


    public Account(int id, String name){
        this.id=id;
        this.name=name;
        this.balance=0;

    }
    public Account (int id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getbalance(){
        return balance;
    }
    public int credit(int amount){
        return balance+amount;
    }
    public int debit(int amount){
        if(amount <= balance)
            balance=amount-balance;
        else
            System.out.println("Przekroczona kwota");
        return balance;
    }
    public int transferTo (Account another  , int amount)
    {
        if (amount <= balance)
            this.balance= balance + another.amount;
        else
            System.out.println("Przekoroczona kwota");
        return balance;

    }
    public String toString()
    {
        return "Account[id= " + id + "  name  "+ name + " balance= " + balance + "]";
    }
}
