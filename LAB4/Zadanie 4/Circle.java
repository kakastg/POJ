/*
    Klaudia Klebba
    Kacper Wieczorek
    Zadanie 4 lab4
    Tworzenie klasy shape i dziedziczących
    */
public class Circle extends Shape {

    private double radius;
    final double pi = Math.PI;

    public Circle() {
        radius = 1.0d;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    public double getarea() {

        return pi * Math.pow(radius, 2);
    }

    public double getperimeter() {
        return 2 * pi * radius;
    }

    public String toString()
    {
        return "Circle = [Color = "+getcolour()+", filled = "+isFilled()+", radius = "+radius+"]";
    }
}
