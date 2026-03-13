package Pattern.FrequencyCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * make a class account with these details( name, age, accountNumber, amount
 * if name is there can see the personal balance and information
 * perform the operation also: withdraw and deposit
 * throw an exception
 * buffered reader (user input for withdraw or deposit)
 * make the account iterable for the higher official
 * first ask the name and if admin and manager can retrieve all the details
 * count the details of the user whose account has balance more than 100000
 * */
enum Role{
    CUSTOMER,
    MANAGER,
    ADMIN
}

class InsufficientAmountException extends Exception{
    public InsufficientAmountException(String message){
        super(message);
    }
}
class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String message){
        super(message);
    }
}
class Account{
    private String name;
    private int accountNumber;
    private double balance;
    public Account(String name, int accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void login(String username) throws AccountNotFoundException{
        if(username.equals("admin") && username.equals("manager")){
            System.out.println("Access granted to the system");
        }else{
            throw new AccountNotFoundException("Unable to find your account");
        }
    }
    public void withdraw(double balance, double amount)throws InsufficientAmountException{
        if(balance> amount){
            System.out.println("Transaction successful");
        }else{
            throw new InsufficientAmountException("You dont have enough balance for transaction");

        }
        balance -= amount;
        System.out.println("Your withdraw amount: " + amount);
        System.out.println("Your remaining balance: "+ balance);
    }
    public void deposit(double amount, double balance) throws NumberFormatException{
    if(amount>0){
        System.out.println("Deposit successful");
        balance +=amount;
        System.out.println("Your total balance after deposit is: " + balance);
    }else{
        throw new NumberFormatException("Deposit positive amounts");
    }
    }
    public String getName(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
public class AccountService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int data = Integer.parseInt(br.readLine());
        System.out.println("Enter your name: ");


    }
}
