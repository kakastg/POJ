/*
 * Autorzy: Klaudia Klebba
 *          Kacper Wieczorek
 * Zadanie 2 POINT2D
 *
 */
 
public class Point3D extends Point2D {

    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z=z;
    }
    public Point3D(){}
    public float getZ()
    {
        return z;
    }
    public void setZ(float z)
    {
        this.z=z;
    }
    public void setXYZ(float x, float y, float z)
    {
        this.z=z;
    }
    public float [] getXYZ={getX(),getY(),z};

    public String toString()
    {
        return "x: " + getX() + " y: " + getY() + " z: " + z;
    }
}
