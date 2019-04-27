/*
    Klaudia Klebba
    Kacper Wieczorek
    Zadanie 6 lab4
    Tworzenie licznika innych wyrazów;
    */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DifferentWords {

    public static void main(String args[]) throws FileNotFoundException {
        Scanner scanner = new Scanner( new File("E:\\Java\\src\\tekst.txt"), "UTF-8" ); //Proszę
        String s = scanner.useDelimiter("\\A").next();
        scanner.close();

        String[] splitted = s.split(" ");
        Map<String, Integer> hashmapa = new HashMap<String, Integer>();

        for (int i=0; i<splitted.length ; i++) {
            if (hashmapa.containsKey(splitted[i])) {
                int cont = hashmapa.get(splitted[i]);
                hashmapa.put(splitted[i], cont + 1);
                hashmapa.remove(splitted[i]);
            } else {
                hashmapa.put(splitted[i], 1);
            }
        }
        System.out.println(hashmapa);
    }

}
