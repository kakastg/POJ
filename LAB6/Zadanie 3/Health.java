/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 3 lab6
    Klasa Health
     */
public class Health extends Insurance {
    public Health()
    {
        super();
    }

    @Override
    public void setCost() {
        monthlyPrice=196.0d;
    }

    @Override
    public void display() {
        System.out.println(this.monthlyPrice);
    }
}

