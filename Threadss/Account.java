package Threadss;

//make a account class
/*
* if the balance is more than amount then it can withdraw
* else throw an exception or simple message(if possible throw exception)
* make the thread object and use the method
* main: start the thread bitch
* */
class InSufficientFundException extends Exception{
    public InSufficientFundException(String message){
        super(message);
    }
}
class UserService{
    int balance = 100000;
     synchronized void withdraw(int amount) throws InSufficientFundException{
        //bug was here
        if(amount < balance){
            System.out.println("Have withdrawn the amount of : " + amount);
            balance -= amount;
            System.out.println("Remaining balance in your account: " + balance);
        }else{
            throw new InSufficientFundException("Not enough balance in your account");
        }
    }
}
public class Account {
    public static void main(String[] args) throws InSufficientFundException {
        UserService user1 = new UserService();
        Thread t1 = new Thread(() ->{
            try {
                user1.withdraw(1000);
            } catch (InSufficientFundException e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Called for the withdraw method");
            }
        });


        Thread t2 = new Thread(() ->{
            try {
                user1.withdraw(80000);
            } catch (InSufficientFundException e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Called for the withdraw method");
            }
        });
        t1.start();
        t2.start();
    }
}
