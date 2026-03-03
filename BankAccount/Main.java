package BankAccount;

public class Main {
    public static void main(String[] args) {
        savingAccount s1 = new savingAccount();
        s1.accountNumber = "918288282";
        s1.balance = 989888.89;
        s1.calculateInterest(989888.89, 5, 9);
        s1.deposit(9000);
        s1.displayBalance();
        s1.withdraw(900098);
        s1.displayBalance();

    }
    
}
