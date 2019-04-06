/*
Aleksander Tyński
Kacper Wieczorek
Zadanie 2 lab3
Tworzenie klasy InvoiceItem
 */
public class InvoiceItem {
    private int id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem (int id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    public int getID (){
        return id;
    }
    public String getdesc(){
        return desc;
    }
    public int getqty(){
        return qty;
    }
    public void setqty(int qty){
        this.qty = qty;
    }
    public double getunitPrice(){
        return unitPrice;
    }
    public void setunitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return  unitPrice * qty;
    }

    public String toString(){
        return "InvoiceItem[id="+id+", desc="+desc+", qty="+qty+",unitPrice="+unitPrice+"]";
    }
}
