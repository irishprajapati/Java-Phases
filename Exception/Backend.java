package Exception;
class InvalidPaymentException extends Exception{
    public InvalidPaymentException(String text)
    {
        super(text);
    }
}
class PaymentFailedException extends Exception{
    public PaymentFailedException(String text){
        super(text);
    }
}
class PaymentExecution{
    public void processPayment(double balance, double paymentAmount) throws InvalidPaymentException, PaymentFailedException {
        if(paymentAmount <= 0 ){
            throw new InvalidPaymentException("invalid payment amount entered");
        }
        if(paymentAmount > balance){
            throw new PaymentFailedException("Not sufficient balance");
        }else{
            System.out.println("Payment processed");
        }
        balance = balance - paymentAmount;
        System.out.println("remaining Balance: "+ balance);
    }
}
public class Backend {
    static void main(String[] args) {
        PaymentExecution payment1 = new PaymentExecution();
        try{
            payment1.processPayment(10000,900);
        }catch(InvalidPaymentException e){
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            throw new RuntimeException(e.getMessage());
        }finally {
            System.out.println("Payment transaction failed");
        }
    }
}
