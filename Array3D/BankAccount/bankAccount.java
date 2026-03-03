package BankAccount;

class bankAccount {
    String accountNumber;
    double balance;
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public void displayBalance(){
        System.out.println("Account Number: "+ accountNumber + " Balance available: " + balance);
    }
}