/*
    Dorota Matkowska
    Kacper Wieczorek
    Zadanie 5 lab5
    Klasa Customer i Invoice
     */
public class Customer {
    private int id;
    private String name;
    private int discount; //procent

    public Customer (int id, String name, int discount)
    {
        this.id=id;
        this.name=name;
        this.discount=discount;
    }
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount)
    {
        this.discount=discount;
    }
    public String toString()
    {
        return name+"("+id+")";
    }
}
