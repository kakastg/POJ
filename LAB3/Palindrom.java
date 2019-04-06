/*
Aleksander Tyński
Kacper Wieczorek
Zadanie 7 lab3
Palindrom
*/
public class Palindrom {

    public static boolean palindrom(String lancuch) {

        StringBuilder tekst = new StringBuilder(lancuch);

        return lancuch.equals(tekst.reverse().toString());

    }

    public static void main(String[] args){

        String lancuch = "atak kata";//muzo raz daj jad za rozum//wódy żal dla żydów;

        System.out.println("Łańcuch tekstowy: " + lancuch + (palindrom(lancuch) ? " jest" : " nie jest") + " palindromem");
    }
}
