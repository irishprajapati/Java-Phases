package Interfaces;
interface PaymentMethod{
    void pay(double amount);
}
class EsewaPayment implements PaymentMethod{
    @Override
        public void pay(double amount){
            System.out.println("Amount paid through Esewa: " + amount);
        }
}
class KhaltiPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Amount paid through khalti: " + amount);
    }
}
class BankTransferPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Amount paid through bank: " + amount);
    }
}
class CheckoutService{
    public void processPayment(PaymentMethod method, double amount){
        method.pay(amount);
    }
}
public class Payment {
    public static void main(String[] args) {
        PaymentMethod esewa = new EsewaPayment();
        PaymentMethod khalti = new KhaltiPayment();
        PaymentMethod bank = new BankTransferPayment();
        CheckoutService checkout = new CheckoutService();
        checkout.processPayment(esewa, 10000);
        checkout.processPayment(khalti, 20000);
        checkout.processPayment(bank, 90000);

    }
    
}
