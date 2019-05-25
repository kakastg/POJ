/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 3 lab6
    Klasa Life
     */
public class Life extends Insurance {
    public Life()
    {
        super();
    }

    @Override
    public void setCost() {
        monthlyPrice=36.0d;
    }

    @Override
    public void display() {
        System.out.println(this.monthlyPrice);
    }
}
