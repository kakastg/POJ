/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 7 lab6
    Comarator z klasa Pizza
     */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PizzaApplication {

    public static void main(String[] args)
    {
        Random rand = new Random();
        Pizza[] pizzadel;
        pizzadel = new PizzaDeluxe[40];
        for(int i=0;i<pizzadel.length;i++)
        {
            pizzadel[i]=new PizzaDeluxe();
            pizzadel[i].name="Pizza Deluxe";
            pizzadel[i].price=rand.nextInt(50);
            pizzadel[i].calories=300+rand.nextInt(1000);
            System.out.println(pizzadel[i].getPrice());
        }

        Pizza[] pizzaspec;
        pizzaspec= new PizzaSpecial[40];
        for(int i=0;i<pizzaspec.length;i++)
        {
            pizzaspec[i]=new PizzaSpecial();
            pizzaspec[i].name="Pizza Special";
            pizzaspec[i].price=rand.nextInt(40);
            pizzaspec[i].calories=300+rand.nextInt(1000);
        }

        Pizza[] pizzawoo;
        pizzawoo = new PizzaWoogy[40];
        for(int i=0;i<pizzawoo.length;i++)
        {
            pizzawoo[i]=new PizzaWoogy();
            pizzawoo[i].name="Pizza Woogy";
            pizzawoo[i].price=rand.nextInt(35);
            pizzawoo[i].calories=300+rand.nextInt(1000);
        }

        Arrays.sort(pizzawoo,Pizza::compareTo);
        Arrays.sort(pizzadel,Pizza::compareTo);
        Arrays.sort(pizzaspec,Pizza::compareTo);
    }
}
