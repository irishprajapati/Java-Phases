package MoreOfInterfaces;
interface MessageService{
    void send(String message);
}
public class Sender {
    public static void main(String[] args) {
        MessageService email = message -> System.out.println("Email sent: "+ message);
        MessageService sms = message -> System.out.println("SMS: " + message);
        email.send("Welcome to leapfrog technology");
        sms.send("989988888");
    }
    
}
