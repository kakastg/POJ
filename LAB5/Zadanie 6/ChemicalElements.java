/*
    Dorota Matkowska
    Kacper Wieczorek
    Zadanie 6 lab5
    Klasa ChemicalElements
     */
     
     public class ChemicalElements {
    private String name;
    private String symbol;
    private int number;


    public ChemicalElements(String name, String symbol, int number){
        this.name = name;
        this.symbol = symbol;
        this.number = number;

    }

    public String getName() {
        return this.name;
    }

    public String getSymbol(){
        return  this.symbol;
    }

    public int getNumber(){
        return this.number;
    }

    public void isAlkali(){
        switch(number) {
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 87: {
                System.out.println("True");
                break;
            }
            default:
            {
                System.out.println("False");
                break;
            }
        }
    }
    public void isTransition()
    {
        if (number>=21&&number<=112)
        {
            if (number>=21&&number<=31)
            {
                System.out.println("True");
            }
            else if (number>=39&&number<=48)
            {
                System.out.println("True");
            }
            else if (number>=72&&number<=80)
            {
                System.out.println("True");
            }
            else if (number>=104&&number<=112)
            {
                System.out.println("True");
            }
            else
                System.out.println("False");
        }
        else
            System.out.println("False");
    }
    public void isMetal()
    {
        switch(number) {
            case 13:
            case 49:
            case 50:
            case 81:
            case 82:
            case 83:
            case 113:
            case 114:
            case 115:
            case 116:{
                System.out.println("True");
                break;
            }
            default:
            {
                System.out.println("False");
                break;
            }
        }
    }

    public String toString() {
        return "Element[Name="+name+", symbol="+symbol+", Number="+number+"]";
    }


}
