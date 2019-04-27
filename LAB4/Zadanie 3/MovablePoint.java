/*
    Klaudia Klebba
    Kacper Wieczorek
    Zadanie 3 lab4
    Tworzenie klasy Point/MovablePoint
     */
public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(float x, float y,float xSpeed,float ySpeed)
    {
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint()
    {
        xSpeed=0.0f;
        ySpeed=0.0f;
    }
    public float getXSpeed()
    {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed)
    {
        this.xSpeed=xSpeed;
    }
    public float getYSpeed()
    {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed)
    {
        this.ySpeed=ySpeed;
    }
        public void setSpeed(float xSpeed,float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed={xSpeed,ySpeed};

    public String toString()
    {
        return "("+getX()+","+getY()+"), speed="+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move()
    {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
