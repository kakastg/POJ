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
        System.out.println(kolo.toString());
        System.out.println(kolo.distance(kolo));

}
}
