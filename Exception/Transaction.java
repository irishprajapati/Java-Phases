
package Exception;
class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class ATM{
    public void withdraw(double balance, double amount) throws InsufficientBalanceException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance -= amount;
        System.out.println("Withdraw succesfull");
        System.out.println("Remaining balance: " + balance);
    }
}

public class Transaction{
    public static void main(String[] args) {
    ATM a1 = new ATM();
    try{
        a1.withdraw(100000, 20000);
    }catch(InvalidAmountException e){
        System.out.println(e.getMessage());

    }catch(InsufficientBalanceException e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println("Transaction finished");
    }
    }

}