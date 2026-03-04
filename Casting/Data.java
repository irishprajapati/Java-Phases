package Casting;
abstract class Payment{
    public void validate(){
        System.out.println("Payment is validated");
    }
    public void process(){
        System.out.println("Payment processing");
    }
    abstract public void connectToGateway();
}
class OnlinePayment extends Payment{
    @Override
    public void connectToGateway(){
        System.out.println("Connected with system");
    }
}
public class Data {
    public static void main(String[] args) {
        //just for the code structure not running this main method
    }
    
}
