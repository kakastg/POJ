/*
Autorzy:
	Wojciech Lilla
    Kacper Wieczorek
    Zad4. Tworzenie szyfr Cezara
*/
import java.util.Scanner;

public class cezar {

    static String caesar(String wartosc, int zmiana) {
        char[] buffer = value.toCharArray();


        for (int i = 0; i < buffer.length; i++) {

            char letter = buffer[i];
            letter = (char) (letter + zmiana);
            if (letter > 'z') {
                letter = (char) (letter - 26);
            } else if (letter < 'a') {
                letter = (char) (letter + 26);
            }
            buffer[i] = letter;
        }
        return new String(buffer);
    }

    public static void main(String[] args) {

        System.out.println("Kacper");
        System.out.println("Wieczorek");
        String a = caesar("Kacper", 4);
        String b =caesar("Wieczorek", 4);
        System.out.println(a);
        System.out.println(b);
        System.out.println("Wojciech");
        System.out.println("Lilla");
        String d = caesar("Wojciech", 4);
        String e = caesar("Lilla", 4);
        System.out.println(d);
        System.out.println(e);
    }
}
