/*
Aleksander Tyński
Kacper Wieczorek
Zadanie 4 lab3
Tworzenie klasy Date
 */
public class Date {
    private int day;
    private int month;
    private int year;


    public Date (int day, int month, int year){
        this.day = day;
        this.month=month;
        this.year=year;
    }
    public int getday (){
        return day;
    }
    public int getmonth(){
        return month;
    }
    public int getyear(){
        return year;
    }
    public void setday(int day){
        this.day = day;
    }
    public void setmonth(int month){
        this.month = month;
    }
    public void setyear(int year){
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return "Date["+day+"/"+month+"/"+year+"]";
    }
}
