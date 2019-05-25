/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 7 lab6
    Comarator z klasa Pizza
     */
public class Pizza implements Comparable<Pizza> {

    protected double calories;
    protected String name;
    protected double price;

    public Pizza(double calories, String name, double price)
    {
        this.calories=calories;
        this.name=name;
        this.price=price;
    }

    public Pizza() {

    }

    public double getCalories()
    {
        return calories;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public String toString()
    {
        return "Pizza - "+name+", "+calories+" calories, $"+price;
    }

    @Override
    public int compareTo(Pizza o) {
    return (int) (this.price-o.price);
    }

public int compare(Pizza a, Pizza b)
{
    return (int) (a.price-b.price);
}
}
