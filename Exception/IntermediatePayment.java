package Exception;

class Product{
    int id;
    String name;
    double price;
    int stock;
    //making the constructor
    public Product(int id, String name, double price, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
class InvalidPaymentsException extends Exception{
    public InvalidPaymentsException(String message){
        super(message);
    }
}
class InsufficientFundsException extends  Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class OutOfStocksException extends Exception{
    public OutOfStocksException(String message){
        super(message);
    }
}
class InvalidQuantitiesException extends Exception{
    public InvalidQuantitiesException(String message){
        super(message);
    }
}
class PaymentProcessor{
    public void processPayment(double balance, double paymentAmount) throws InvalidPaymentsException, InsufficientFundsException{
        if(paymentAmount <=0){
            throw new InvalidPaymentsException("Payment amount should not be zero");
        }
        if(paymentAmount > balance){
            throw new InsufficientFundsException("Balance not sufficient");
        }
            balance = balance - paymentAmount;
            System.out.println("Remaining balance : " + balance);
            System.out.println("Order success");
    }
}
class OrderService{
    PaymentProcessor paymentprocess = new PaymentProcessor();
    public void placeOrder(Product product, int quantity, double userBalance)
            throws InvalidQuantitiesException, OutOfStocksException {
        if(quantity <= 0){
            throw new InvalidQuantitiesException("Quantity cannot be zero");
        }
        if(quantity > product.stock){
            throw new OutOfStocksException("Sorry unable to find these in stocks");
        }
        }

    }

public class IntermediatePayment {
    static void main(String[] args) {
        OrderService order1 = new OrderService();
        PaymentProcessor payment = new PaymentProcessor();
        try{
            order1.

        }
    }
}
