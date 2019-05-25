/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 3 lab6
    Aplikacja UseInsurance
     */import java.util.Scanner;

public class UseInsurance {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Choose insurance (Life/Health) >> ");
        String typ = input.next();
        switch (typ) {
            case "Life": {
                Life life = new Life();
                life.setCost();
                life.display();
                break;
            }
            case "Health": {
                Health health = new Health();
                health.setCost();
                health.display();
                break;
            }
            default: {
                System.out.println("Wrong type of insurance. Try again later.");
                break;
            }
        }
        input.close();
    }
}

