package ConceptUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* A banking backend checks:
withdraw amount
balance

Possible exceptions:
InvalidAmountException
InsufficientBalanceException

Requirement
User enters withdrawal amount.
Account balance = 5000.
If amount ≤ 0 → invalid amount.
If amount > balance → insufficient balance.
Otherwise withdraw.*/
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
class AmountValidator{
    double balance = 5000;
    public void withdrawAmount(double amount) throws InvalidAmountException, InsufficientBalanceException{
        if(amount<=0){
            throw new InvalidAmountException("Please enter valid amount for transaction");
        }
        if(amount > balance){
            throw new InsufficientBalanceException("You dont have enough balance to withdraw");
        }if(amount>100 | amount<balance){
            System.out.println("You can proceed the transaction");
        }
        balance -= amount;
        System.out.println("You have withdraw: Nrs"+ amount);
        System.out.println("Your remaining balance: Nrs"+ balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter amount to withdraw: ");
            double amount = Double.parseDouble(br.readLine());
            AmountValidator bank = new AmountValidator();
            bank.withdrawAmount(amount);
        }catch (InvalidAmountException | InsufficientBalanceException | IOException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
