package Claude;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Account{
    private Long id;
    private String name;
    private double balance;
    private String branch;
    public Account(Long id, String name, double balance, String branch){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.branch = branch;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", branch='" + branch + '\'' +
                '}';
    }
}
public class Example1 {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1L, "Anisha", 12222.90, "NIC"));
        accounts.add(new Account(2L, "Ravi", 15000.00, "NIC"));
        accounts.add(new Account(3L, "Sita", 9800.50, "SAVINGS"));
        accounts.add(new Account(4L, "Anisha", 12222.90, "CURRENT")); // same name & balance
        accounts.add(new Account(5L, "Kiran", 15000.00, "NIC")); // same balance
        accounts.add(new Account(6L, "Ravi", 5000.75, "SAVINGS")); // same name
        accounts.add(new Account(7L, "Maya", 20000.00, "CURRENT"));
        accounts.add(new Account(8L, "Sita", 9800.50, "NIC")); // same name & balance
        accounts.add(new Account(9L, "Arjun", 7500.25, "SAVINGS"));
        accounts.add(new Account(10L, "Kiran", 20000.00, "CURRENT")); // same name, different balance
        Comparator<Account> accountComparator = Comparator.comparingLong(Account::getId).thenComparing(Account::getName).thenComparingDouble(Account::getBalance);
        accounts.sort(accountComparator);
        for(Account data: accounts){
            System.out.println(data);
        }
    }
}
