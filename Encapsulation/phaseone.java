class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){//constructor preventing from the balance to be negative
        if (initialBalance <0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }
    public void deposit(double amount){
    if(amount<=0){
        System.out.println("Deposit amount cannot be zero");
        return;
    }
    }
    }

public class phaseone {
    
}
