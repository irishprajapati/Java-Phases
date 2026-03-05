package Interfaces;
interface Notification{
    void send(String message);
}
class EmailNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("You recieved a email: " + message);
    }
}
class SMSNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("You recieved a sms message: " + message);
    }
}
class PushNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("You recieved a notification: " + message);
    }
}
class UserService{
    public void notifyUser(Notification method, String message){
        method.send(message);
    }
}
public class thinking {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();
        UserService data = new UserService();
        data.notifyUser(email, "Leapfrog meetings schedule");
        data.notifyUser(sms, "Credited xxx amount in your bank account");
        data.notifyUser(push, "10000 steps completed");
    }
    
}
