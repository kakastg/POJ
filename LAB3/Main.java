public class Main {
    public static void main(String[] args) {
        Employee Kacper = new Employee(1, "Kacper", "Wieczorek", 5000);
        InvoiceItem Aleksander = new InvoiceItem(1, "opis", 5000, 2);
        Date Kiedys = new Date(28, 8, 1997);
        Account My = new Account(1,"Aleksander",1);
        Time Zegarek = new Time(5, 23, 45);
        Palindrom n1= new Palindrom("Atak kata");
        Palindrom n2= new Palindrom("Muzo, raz daj jad za rozum");
        Palindrom n3= new Palindrom("Wódy żal dla żydów");
        
        System.out.println(Kacper);
        System.out.println(Aleksander);
        System.out.println(Kiedys);
        System.out.println(Konto);
        System.out.println(Zegarek);
        System.out.println(n1.getPalindrom()+" "+n1.sprawdz());
        System.out.println(n2.getPalindrom()+" "+n2.sprawdz());
        System.out.println(n3.getPalindrom()+" "+n3.sprawdz());
    }
}
