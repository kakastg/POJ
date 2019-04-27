/*
    Klaudia Klebba
    Kacper Wieczorek
    Zadanie 4 lab4
    Tworzenie klasy shape i dziedziczących
    */
public class Square extends Rectangle
{

    public Square()
    {
        super();
        double side = 1.0;
    }

    public Square(double side)
    {
        super(side, side);
        side =side;
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
        side =side;
    }

    public double getSide()
    {
        return super.getWidth();
    }

    public void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getArea()
    {
        return getSide()*getSide();
    }

    public double getPerimeter()
    {
        return 4*getSide();
    }


    public String toString()
    {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
