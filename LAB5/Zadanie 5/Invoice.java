/*
    Dorota Matkowska
    Kacper Wieczorek
    Zadanie 5 lab5
    Klasa Customer i Invoice
     */
public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id,Customer customer,double amount)
    {
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }
    public int getID()
    {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getAmount()
    {
        return Double.toString(amount);
    }
    public String getCustomerName()
    {
        return customer.getName();
    }
    public double getAmountAfterDiscount()
    {
        return amount*(1.0d-(customer.getDiscount()/100.0d));
    }
}
