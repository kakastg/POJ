/*
    Klaudia Klebba
    Kacper Wieczorek
    Zadanie 4 lab4
    Tworzenie klasy shape i dziedziczących
    */
public class Main {

    public static void main(String[] args) {
        Shape ksztalt = new Shape("blue",true);
        Circle kółko = new Circle(1.4d,"red",false);
        Rectangle prostykąt = new Rectangle(1.5d,53.7d,"yellow",true);
        Square kładrat = new Square(1.3d,"brown",true);
    }
}
