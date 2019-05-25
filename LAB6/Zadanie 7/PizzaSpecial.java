/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 7 lab6
    Comarator z klasa Pizza
     */
import java.util.Random;

public class PizzaSpecial extends Pizza {
    Random rand = new Random();
    protected double calories;
    protected String name;
    protected double price;
    public PizzaSpecial(double calories, String name, double price)
    {
        super(calories,name,price);
        super.calories=calories;
        super.name=name;
        super.price=price;
    }
    public PizzaSpecial()
    {
        super();
    }

    public void setCalories(double calories) {
        this.calories = 300+rand.nextInt(1000);
    }
    public void setName(String name)
    {
        this.name="Pizza Special";
    }
    public void setPrice(double price)
    {
        this.price=rand.nextInt(25);
    }
}
