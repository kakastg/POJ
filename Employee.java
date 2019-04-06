/*
Aleksander Tyński
Kacper Wieczorek
Zadanie 1 lab3
Tworzenie klasy Employee
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }
    public int getID (){
    return id;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName (){
        return lastName;
    }
    public String getName(){
        return firstName+lastName;
    }
    public int getsalary(){
        return salary;
    }
    public void setsalary(){
        this.salary = salary;
    }
    public int getAnnualsalary(){
        return salary *12;
    }
    public int raisesalary(int procent){
       return this.salary = salary * procent;
    }
    public String toString(){
        return "Employee[id="+id+", name="+firstName+lastName+", salary="+salary+"]";
    }
}
