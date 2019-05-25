/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 8 lab6
      Klasa UsedCar, Exception
     */
public class UsedCarException extends Exception {


    public UsedCarException( String vinNum)
    {
        super("Wrong info entered");
    }
}
