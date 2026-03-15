package Pattern.FrequencyCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum type{
    DEPOSIT,
    WITHDRAW
}
class Transaction{
    private int transactionId;
    private String username;
    private double amount;
    public Transaction(int transactionId, String username, double amount){
        this.transactionId = transactionId;
        this.username =  username;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }
    public String getUsername(){
        return username;
    }
    public double getAmount(){
        return amount;
    }
    public void setTransactionId(int transactionId){ this.transactionId = transactionId;}
    public void setUsername(String username){this.username = username;}
    public void setAmount(double amount){this.amount = amount;}
    @Override
    public String toString(){
        return "Username: " + getUsername() + " TransactionID: "  + getTransactionId() + "Amount: " + getAmount();
    }
}
public class TransactionAnalyzer {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(12345, "erish", 1299999.99));
        transactions.add(new Transaction(23445, "anish", 99889999.99));
        transactions.add(new Transaction(34567, "suresh", 45000.50));
        transactions.add(new Transaction(45678, "ramesh", 780000.75));
        transactions.add(new Transaction(56789, "mahesh", 12000.00));
        transactions.add(new Transaction(67890, "dinesh", 98500.40));
        transactions.add(new Transaction(78901, "binod", 650000.10));
        transactions.add(new Transaction(89012, "santosh", 34000.60));
        transactions.add(new Transaction(90123, "prabin", 999999.99));
        transactions.add(new Transaction(11223, "kiran", 150000.00));
        //just to check whether the overriden string method is working or not
//        for(Transaction t1: transactions){
//            System.out.println(t1);
//        }
        type Type; //enum usage
        Map<Transaction, Integer> transactionData = new HashMap<>();
        transactionData.put()


    }
}
