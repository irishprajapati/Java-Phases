package ConceptUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* E-commerce backend checks:
stock availability
quantity
payment

Possible exceptions:
InvalidQuantityException
OutOfStockException
*
Requirement
Product stock = 10
User enters quantity
If quantity ≤ 0 → invalid
If quantity > stock → out of stock
* */
class InvalidQuantityException extends Exception{
    public InvalidQuantityException(String message){
        super(message);
    }
}
class OutOfStockException extends Exception{
    public OutOfStockException(String message){
        super(message);
    }
}
class OrderExecution{
    int stock = 10;
    public void buy(int quantity) throws InvalidQuantityException, OutOfStockException{
        if(quantity<0){
            throw new InvalidQuantityException("Quantity must be positive");
        }
        if(quantity > stock){
            throw new OutOfStockException("Not enough stock available");
        }
        stock -= quantity;
        System.out.println("Purchase successful: " + quantity);
        System.out.println("Remaining stock: " + stock);
    }
}
public class StockOrder {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter quantity of purchase: ");
            Integer quantity = Integer.parseInt(br.readLine());
            OrderExecution order1 = new OrderExecution();
            order1.buy(quantity);
        }catch (NumberFormatException | IOException | InvalidQuantityException | OutOfStockException e){
            System.out.println(e.getMessage());
        }
    }
}
