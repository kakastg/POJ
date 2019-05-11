/*
    Dorota Matkowska
    Kacper Wieczorek
    Zadanie * lab5
    Klasa Main
     */
public class Main {

    public static void main(String[] args) {

        MyPoint punkt = new MyPoint(1,1);

        MyPoint[] punkty = new MyPoint[10];
        for (int i = 0; i < punkty.length; i++) {
            punkty[i] = new MyPoint(i + 1, i + 1);
        }
        for (MyPoint punk : punkty)
        {
            System.out.println("Dystans między punktami "+punkt+" oraz "+punk+"wynosi "+punkt.distance(punk));
        }

        MyCircle kolo = new MyCircle(5,5,10);
        MyCircle kolo1 = new MyCircle(10,3,23);
        System.out.println(kolo.toString());
        System.out.println("Odległość między środkami okręgów "+kolo.distance(kolo1));
        MyTriangle trojkat=new MyTriangle(1,3,1,3,4,5);
        System.out.println(trojkat.getType());

    }
}
