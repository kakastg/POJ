/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 1 lab6
    Implementacja Interface Movable
     */
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public String toString()
    {
        return "Top left, Bottom Right = ("+topLeft.toString()+","+bottomRight.toString()+")";
    }

    public void moveUp() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
