/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 8 lab6
      Klasa UsedCar, Exception 
     */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void addCar( ArrayList<UsedCar> listOfCars) {
        Scanner input = new Scanner(System.in);
        String vinNum;
        String make;
        int year;
        double mileage;
        double price;
        String answer;

        do {
            System.out.println("Enter VIN: ");
            vinNum = input.next();

            System.out.println("Enter a Make: ");
            make = input.next();

            System.out.println("Enter a year: ");
            year = input.nextInt();

            System.out.println("Enter mileage: ");
            mileage = input.nextDouble();

            System.out.println("Enter a price: ");
            price = input.nextDouble();

            try {
                listOfCars.add(new UsedCar( vinNum, make, year, mileage, price));
                System.out.println("Used Car added");
            } catch (UsedCarException e) {
                e.getMessage();
            }

            System.out.println("Enter another car? (Yes/No) ");
            answer = input.next();

        } while(answer.equals("Yes"));

        input.close();
    }

    public static void main(String[] args) {

        ArrayList<UsedCar> listOfCars = new ArrayList<UsedCar>();
        addCar(listOfCars);

        System.out.println("List of Used Cars");
        for( UsedCar car : listOfCars ){
            System.out.println(car);
        }
    }

}
