/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 6 lab6
    Interface, abstrakcja Loan
     */
import java.util.*;
import java.lang.Exception.*;

class CreateLoans {
    private Loan[] loanDetails = new Loan[5];

    public static void main(String[] args) {
        CreateLoans loan = new CreateLoans();

        loan.getLoanDetails();
        loan.displayDetails();
    }

    public void displayDetails() {
        System.out.println("LOAN NUMBER\tLAST NAME\tLOAN AMOUNT\t" +
                "INTEREST RATE\tLOAN TERM\tTOTAL AMOUNT OWED");

        for (int x = 0; x < loanDetails.length; x++) {
            System.out.println(loanDetails[x].toString());
        }
    }

    public static Character getLoanType() {
        Scanner sc = new Scanner(System.in);
        Character loanType;


        do {
            System.out.print(" Is the loan for personal or business purposes? (P/B): ");
            loanType = sc.next().toUpperCase().charAt(0);

            if (!((loanType.equals('P')) || (loanType.equals('B'))))
                System.out.println("  >> ERROR: Invalid input.");
        } while (!((loanType.equals('P')) || (loanType.equals('B'))));

        return loanType;
    }

    public static String getLoanNum() {
        Scanner sc = new Scanner(System.in);


        System.out.print(" Loan number: ");

        return sc.next();
    }

    public static String getLastName() {
        Scanner sc = new Scanner(System.in);
        String lastName;

        try {

            System.out.print(" Customer last name: ");
            lastName = sc.next();


            for (int x = 0; x < lastName.length(); x++) {
                if (Character.isDigit(lastName.charAt(x))
                        || !(Character.isLetterOrDigit(lastName.charAt(x)))) {
                    throw (new InputMismatchException("Invalid. Last name " +
                            "contains digits or symbols."));
                }
            }
        } catch (InputMismatchException e) {
            getExceptionMessage("last name", e);
            return getLastName();
        }

        return lastName;
    }

    public static double getLoanAmt() {
        Scanner sc = new Scanner(System.in);
        double loanAmt;

        // asks user to enter loan amount, then validates input
        try {
            System.out.print(" Loan amount: ");
            loanAmt = sc.nextDouble();

            if (loanAmt <= 0) {
                throw (new InputMismatchException("Loan amount must " +
                        "not be zero or lesser."));
            } else if (loanAmt > 100000) {
                throw (new InputMismatchException("Loan amount must " +
                        "not be over $100,000.00"));
            }

            return loanAmt;
        } catch (InputMismatchException e) {
            getExceptionMessage("loan amount", e);
            return getLoanAmt();
        }
    }

    public static double getPrimeIntRate() {
        Scanner sc = new Scanner(System.in);
        double primeIntRate;


        try {
            System.out.print(" Prime interest rate (%): ");
            primeIntRate = sc.nextDouble();

            if (primeIntRate <= 0) {
                throw (new InputMismatchException("Interest rate must " +
                        "not be zero or lesser."));
            }

            return primeIntRate;
        } catch (InputMismatchException e) {
            getExceptionMessage("interest rate", e);
            return getPrimeIntRate();
        }
    }

    public static int getTerm() {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print(" Loan term (1, 3, or 5): ");
            return sc.nextInt();
        } catch (InputMismatchException e) {
            getExceptionMessage("loan term", e);
            return getTerm();
        }
    }

    public void getLoanDetails() {
        Character loanType;
        String loanNum;
        String lastName;
        double loanAmt;
        double primeIntRate;
        int term;

        for (int x = 0; x < loanDetails.length; x++) {
            System.out.println("Enter loan details for customer " + (x + 1) + "...");

            loanType = getLoanType();
            loanNum = getLoanNum();
            lastName = getLastName();
            loanAmt = getLoanAmt();
            primeIntRate = getPrimeIntRate();
            term = getTerm();

            System.out.println();


            if (loanType.equals('P')) {
                loanDetails[x] = new PersonalLoan(loanNum, lastName,
                        loanAmt, term, primeIntRate);
            } else if (loanType.equals('B')) {
                loanDetails[x] = new BusinessLoan(loanNum, lastName,
                        loanAmt, term, primeIntRate);
            }
        }
    }

    public static void getExceptionMessage(String data, InputMismatchException e) {
        if (e.getMessage() == null) {
            System.out.println("  >> ERROR: Invalid input. Enter " +
                    data + " detail again.");
        } else {
            System.out.println("  >> ERROR: " + e.getMessage());
        }
    }
}
