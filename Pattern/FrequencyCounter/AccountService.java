package Pattern.FrequencyCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

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
enum Role {
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
    public Account(String name, int accountNumber, double balance, double dailyLimit, double minimumBalance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount)throws InsufficientAmountException{
        if( amount< 0){
            System.out.println("Withdraw amount cannot be negative.");
        }if(balance<amount){
            throw new InsufficientAmountException("You dont have enough balance for transaction");
        }
        if(balance == amount){
            System.out.println("You should handle some amount for account continuity.");
        }
        balance -= amount;
        System.out.println("Transaction successful");
        System.out.println("Your withdraw amount: " + amount);
        System.out.println("Your remaining balance: "+ balance);
    }
    //Refactor code what if the minium deposit is 10 Rs
    public void deposit(double amount) throws NumberFormatException{
    if(amount<=50){
        System.out.println("Deposit amounts need to be more than Rs 50");
    }else{
        balance += amount;
        System.out.println("Depostied amount: " + amount);
        System.out.println("Total balance: " + balance);
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
    //overridden method to show the details instead of jvm printing object class
    @Override
    public String toString(){
        return "Name: " + getName()  +
                ", AccountNumber: " + getAccountNumber() + "," + " Account Balance: " + getBalance();
    }
}
public class AccountService {
    public static void main(String[] args) throws IOException, AccountNotFoundException, InsufficientAmountException {
        Map<String, Account> accounts = new HashMap<>();
        accounts.put("erish", new Account("Erish", 1111, 200000));
        accounts.put("anish", new Account("Anish", 2222, 50000));
        accounts.put("salin", new Account("Salin", 3333, 120000));
        accounts.put("sarthak", new Account("Sarthak", 4444, 30000));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String username = br.readLine();
        Role role;
        if(username.equals("admin")) {
            role = Role.ADMIN;
        }else if(username.equals("manager")){
            role = Role.MANAGER;

        }else if (accounts.containsKey(username)){
            role =Role.CUSTOMER;
        }else{
            throw new AccountNotFoundException("User not found");

        }
        System.out.println("Logged in as: " + role);
        if(role ==Role.CUSTOMER){
            Account acc = accounts.get(username);
            System.out.println("Welcome: " + acc.getName());
            System.out.println("1. Withdraw amount");
            System.out.println("2. Deposit amount");
            System.out.println("3.Check balance");
            int choice = Integer.parseInt(br.readLine());
            if(choice == 1){
                System.out.println("Enter withdraw amount: ");
                double amount = Double.parseDouble(br.readLine());
                acc.withdraw(amount);
            }else if(choice == 2){
                System.out.println("Enter deposit amount: ");
                double amount = Double.parseDouble(br.readLine());
                acc.deposit(amount);
            }else if(choice == 3){
                System.out.println("Your information is here: "+ acc.toString());
            }
        }
        if(role == Role.ADMIN || role == Role.MANAGER){
            System.out.println("All accounts information: ");
            for( Account acc: accounts.values()){
                System.out.println(acc);
            }
            int count = 0;
            for(Account acc: accounts.values()){
                if(acc.getBalance()>10000){
                    count ++;
                }

            }
            System.out.println("Account with balance more than 10000: " + count);
        }
    }
}
