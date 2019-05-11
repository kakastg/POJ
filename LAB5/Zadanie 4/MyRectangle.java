/*
    Dorota Matkowska
    Kacper Wieczorek
    Zadanie 4 lab5
    Klasa MyRectangle
     */
public class MyRectangle {

    private MyPoint p1;
    private MyPoint p2;

    public MyRectangle(int x1, int y1, int x2, int y2)
    {
        this.p1=new MyPoint(x1,y1);
        this.p2=new MyPoint(x2,y2);
    }
    public MyRectangle(MyPoint p1,MyPoint p2)
    {
        this.p1=p1;
        this.p2=p2;
    }

    public String toString()
    {
        return "MyRectangle[p1="+p1.toString()+", p2="+p2.toString()+"]";
    }

    public double getPerimeter()
    {
        return Math.pow(p1.distance(p2.getX(),p1.getY()),2)+Math.pow(p2.distance(p1.getX(),p2.getY()),2);
    }
    public double getArea()
    {
        return p1.distance(p2.getX(),p1.getY())*p2.distance(p1.getX(),p2.getY());
    }


}
