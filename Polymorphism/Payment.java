package Polymorphism;
//parent class
class Payment1{
    final String accountNumber;
    double balance;
    public Payment1(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //making final not to override this method
    final void generateInvoice(){
        System.out.println("Generating invoice for account: " + accountNumber);
    }
    void processPayment(){
        System.out.println("Processing payment of: " + balance + " acocunt: " + accountNumber);
    }
}
class CreditCardPayment extends Payment1{
    @Override
    final void generateInvoice(){
        System.out.println("Generating invoice for account: " + accountNumber);
    }
    @Override
    void processPayment(){
        System.out.println("Processing payment of: " + balance + " acocunt: " + accountNumber);
    }
}
public class Payment {
    public static void main(String[] args) {
        Payment1 transaction1 = new Payment1("190999999", 100000);
        Payment1 transaction2 = new Payment1("12992922", 10999);
        transaction1.generateInvoice();
        transaction1.processPayment();
        transaction2.generateInvoice();
        transaction2.processPayment();
    }
    
}
