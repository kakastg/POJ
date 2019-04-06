/*
Aleksander Tyński
Kacper Wieczorek
Zadanie 6 lab3
8 pracowników / Przykład arrayList;
 */
import java.util.*;
public class arrayList_Company {
    public static void main(String[] args) {
        ArrayList<String> Company_ID = new ArrayList<String>();
        ArrayList<String> Company_NAME = new ArrayList<String>();
        ArrayList<Integer> Company_SALARY = new ArrayList<Integer>();
        ArrayList<String> Company_JOINED = new ArrayList<String>();
        Company_ID.add("1");
        Company_ID.add("2");
        Company_ID.add("3");
        Company_ID.add("4");
        Company_ID.add("5");
        Company_ID.add("6");
        Company_ID.add("7");
        Company_ID.add("8");

        Company_NAME.add("Steve");
        Company_NAME.add("Jason");
        Company_NAME.add("James");
        Company_NAME.add("Thomas");
        Company_NAME.add("Timothy");
        Company_NAME.add("Kacper");
        Company_NAME.add("Paul");
        Company_NAME.add("Gregory");

        Company_SALARY.add(5000);
        Company_SALARY.add(6000);
        Company_SALARY.add(7000);
        Company_SALARY.add(8000);
        Company_SALARY.add(9000);
        Company_SALARY.add(10000);
        Company_SALARY.add(11000);
        Company_SALARY.add(12000);

        Company_JOINED.add("7/11/2008");
        Company_JOINED.add("1/3/2018");
        Company_JOINED.add("4/12/2000");
        Company_JOINED.add("14/2/2004");
        Company_JOINED.add("4/10/2006");
        Company_JOINED.add("24/1/1994");
        Company_JOINED.add("21/5/2008");
        Company_JOINED.add("30/9/1999");

        for(int i=0;i<Company_ID.size();i++)
        {
            System.out.print(Company_ID.get(i)+" "+Company_NAME.get(i)+" "+Company_SALARY.get(i)+" ");
            System.out.println(Company_JOINED.get(i));
        }
    }
}
