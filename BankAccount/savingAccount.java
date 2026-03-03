package BankAccount;

class savingAccount extends bankAccount{
    double interestRate;
    public static double calculateInterest(double principal, double rate, double time){
        double amount = principal * Math.pow((1 * rate/100), time);
        double interest = amount - principal;
        return interest;
    }
}