package Exception;
class InvalidQuantityException extends Exception{
    public InvalidQuantityException(String message) {
        super(message);
    }
}
class OutOfStockException extends Exception{
    public OutOfStockException(String message){
        super(message);
    }
}
class OrderExecution{
    public void purchase(int stock, int quantity) throws  InvalidQuantityException, OutOfStockException{
        if(quantity <=0){
            throw  new InvalidQuantityException("Please input the quantity in right amount");
        }
        if(quantity > stock){
            throw new OutOfStockException("We are unable to process your order because out of stock");
        }else{
            System.out.println("Purchase successful");

        }
        stock = stock - quantity;
        System.out.println("Remaining stock: " + stock);
    }
}
public class Purchase{
    static void main(String[] args) {
    OrderExecution order1 = new OrderExecution();
    try{
        order1.purchase(100, 10);
    }catch (InvalidQuantityException e){
        System.out.println(e.getMessage());
    } catch (OutOfStockException e) {
        throw new RuntimeException(e.getMessage());
    }finally {
        System.out.println("Inventory checked");
    }
    }
}