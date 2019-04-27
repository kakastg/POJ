/*
    Klaudia Klebba
    Kacper Wieczorek
    Zadanie 1 lab4
    Tworzenie klasy Person/Student/Staff
     */
public class Person {

    private String name;
    private String address;

    public Person (String name, String address)
    {
        this.name=name;
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String toString()
    {
        return "Person[name="+name+", adres="+address;
    }
}

