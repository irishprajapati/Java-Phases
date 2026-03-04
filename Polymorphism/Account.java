package Polymorphism;

class BankAccount{
    final String accountNumber;
    //constructor to initalize
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }
    //public method to use from anywhere
    public void displayDetails(){
        System.out.println("Account Number: " + accountNumber);
    }
}
public class Account {
    public static void main(String[] args) {
        //object creation
        BankAccount user1 = new BankAccount("12999999999");
        BankAccount user2 = new BankAccount("099900099");
        user1.displayDetails();
        user2.displayDetails();
    }
}
