/*
    Dorota Matkowska
    Kacper Wieczorek
    Zadanie 1 lab5
    Klasa MyPoint
     */
public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY = {x, y};

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        int xdis = this.x - x;
        int ydis = this.y - y;
        return Math.sqrt(xdis * xdis + ydis * ydis);
    }

    public double distance(MyPoint another) {
        int xdis = this.x - another.x;
        int ydis = this.y - another.y;
        return Math.sqrt(xdis * xdis + ydis * ydis);
    }

    public double distance() {
        int xdis = this.x - 0;
        int ydis = this.y - 0;
        return Math.sqrt(xdis * xdis + ydis * ydis);
    }
}


