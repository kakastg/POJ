/*
    Martyna Klebba
    Kacper Wieczorek
    Zadanie 6 lab6
    Interface, abstrakcja Loan
     */
public class PersonalLoan extends Loan
{
    PersonalLoan(String loanNum, String lastName, double loanAmt, int term, double primeIntRate)
    {
        super(loanNum, lastName, loanAmt, term);
        super.interestRate = 0.02 / (primeIntRate / 100);
    }
}
