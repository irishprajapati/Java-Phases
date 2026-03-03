package MethodOverriding;
class Payment{
    private double amount;
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    //methods
    public void processPayment(){
        System.out.println("Processing generic payment of: " + amount);
    }
    public void printReceipt(){
        System.out.println("Payment of: " + amount + " completed");
    }
}
class CreditCardPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing credit card payment of: " + getAmount());

    }
}
class UPIPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing UPI payment of: " + getAmount());
    }
}
class CashPayment extends Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing cash payment of: " + getAmount());
    }
}
public class Main{
    public static void main(String[] args) {
        Payment p1 = new Payment();
        Payment p2 = new CreditCardPayment();
        Payment p3 = new UPIPayment();
        Payment p4 = new CashPayment();
        p1.setAmount(10000);
        p1.processPayment();
        p1.printReceipt();
        p2.setAmount(20000);
        p2.processPayment();
        p2.printReceipt();
        p3.setAmount(30000);
        p3.processPayment();
        p3.printReceipt();
        p4.setAmount(90000);
        p4.processPayment();
        p4.printReceipt();
    }
}