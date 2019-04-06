/*
Autorzy:
	Wojciech Lilla
    Kacper Wieczorek
    Zad2. Tworzenie methody prostokat
*/
import java.lang.Math; // headers MUST be above the first class




public class Main
{

    public static void main(String[] args){
        prostokat nr1 = new prostokat(21,62);

    }
}
public class prostokat{

    private int dlugosc;
    private int szerokosc;

    public prostokat (int dlugosc, int szerokosc)
    {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;

    }
    public int getdl()
    {
        return dlugosc;
    }
    public int getszer ()
    {
        return szerokosc;
    }
    public int getpole()
    {
        int p;
        p=dlugosc*szerokosc;
        return p;
    }
    public int getobwod ()
    {
        int h;
        h=2*dlugosc+2*szerokosc;
        return h;
    }
    public double getprzekatna ()
    {
        double g;
        g=Math.sqrt((szerokosc*szerokosc)+(dlugosc*dlugosc));
        return g;
    }

}
