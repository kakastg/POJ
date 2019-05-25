/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 2 lab6
    Implementacja Interface Resizable
     */
public class ResizableCircle implements Resizable {
    private Circle circle;
    public ResizableCircle(double radius)
    {
        this.circle = new Circle(radius);
    }

    @Override
    public double resize(int percent) {
        return circle.radius*(1.0d-(percent/100.0d));
    }
    public String toString()
    {
        return "Radius = "+circle.radius;
    }
}
