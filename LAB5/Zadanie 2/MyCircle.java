/*
    Dorota Matkowska
    Kacper Wieczorek
    Zadanie 2 lab5
    Klasa MyCircle
     */
public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){}

    public MyCircle (int x, int y, int radius)
    {
        this.center=new MyPoint(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius)
    {
        this.center=center;
        this.radius=radius;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setRadius(int radius)
    {
        this.radius=radius;
    }
    public MyPoint getCenter()
    {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX()
    {
        return center.getX();
    }
    public int getCenterY()
    {
        return center.getY();
    }
    public void setCenterXY(int x, int y)
    {
        this.center.setXY(x,y);
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public String toString()
    {
        return "MyCircle [promień="+radius+", środek="+center.toString()+"]";
    }
    public double getCircumference()
    {
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another)
    {
        int xdis = this.center.getX() - another.getCenterX();
        int ydis = this.center.getY() - another.getCenterY();
        return Math.sqrt(xdis * xdis + ydis * ydis);
    }
}
