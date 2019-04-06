public class Main {
    public static void main(String[] args) {
        Employee Kacper = new Employee(1, "Kacper", "Wieczorek", 5000);
        InvoiceItem Aleksander = new InvoiceItem(1, "opis", 5000, 2);
        Date Kiedys = new Date(28, 8, 1997);
        Account My = new Account(1,"Aleksander",1);
        Time Zegarek = new Time(5, 23, 45);
        System.out.println(Kacper);
        System.out.println(Aleksander);
        System.out.println(Kiedys);
        System.out.println(Konto);
        System.out.println(Zegarek);
    }
}
