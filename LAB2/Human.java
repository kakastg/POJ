/*
Autorzy:
	Wojciech Lilla
    Kacper Wieczorek
    Zad1. Tworzenie clasy Human
*/
import java.lang.Math; // headers MUST be above the first class


public class Main
{

    public static void main(String[] args){
        Human Wojciech = new Human(21,62,167,"Wojciech",true,41,18872);
        Human Kacper = new Human(21,75,170,"Kacper",true,41,18426);
    }
}
public class Human{

    private int age;
    private int weight;
    private int height;
    private String name;
    private boolean isMale;
    private int feetSize;
    private int indexNumber;

    public Human (int age, int weight, int height, String name, boolean isMale, int feetSize, int indexNumber)
    {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
        this.feetSize = feetSize;
        this.indexNumber = indexNumber;
    }
    public int getage()
    {
        return age;
    }
    public int getWeight ()
    {
        return weight;
    }
    public int getHeight ()
    {
        return height;
    }
    public String getName ()
    {
        return name;
    }
    public boolean isMale ()
    {
        return isMale;
    }
    public int getFeetSize ()
    {
        return feetSize;
    }
    public int getIndexNumber ()
    {
        return indexNumber;
    }

}
