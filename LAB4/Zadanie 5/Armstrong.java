/*
    Klaudia Klebba
    Kacper Wieczorek
    Zadanie 6 lab4
    Tworzenie licznika innych wyrazów;
    */
public class Armstrong {

    public static void main(String[] args) {

        int liczba = 153;

        int pocz_liczba, reszta, wynik = 0, n = 0;

        pocz_liczba = liczba;

        for (;pocz_liczba != 0; pocz_liczba /= 10, ++n);

        pocz_liczba = liczba;

        for (;pocz_liczba != 0; pocz_liczba /= 10)
        {
            reszta = pocz_liczba % 10;
            wynik += Math.pow(reszta, n);
        }

        if(wynik == liczba)
            System.out.println(liczba + " is an Armstrong number.");
        else
            System.out.println(liczba + " is not an Armstrong number.");
    }
}
