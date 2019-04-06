/*
 Aleksander Tyński
 Kacper Wieczorek
 Zadanie 7 lab 3
 czy jest to palindrom?
 */

 class Main {  // jakos działa bez public

    public static void main(String[] args) {
        String pal = "kajak";
        int startPos=0;
        int endPos = pal.length() -1;

        boolean isPal = true;
        while (startPos < endPos)
        {
            String startLetter = pal.substring(startPos, startPos+1);
            String endLetter = pal.substring(endPos, endPos+1);

            if(startLetter.equals(endLetter)==false)
            {
                isPal=false;
                break;
            }
            startPos++;
            endPos--;
        }
        if (isPal==true)
        {
            System.out.println(pal + " jest palnidromem");
        }
        else
        {
            System.out.println(pal + " nie jest palindronem");
        }
    }
}
