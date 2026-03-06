package Enum;
enum Package{
    PENDING("Payment is being processed", false),
    SUCCESS("Payment Completed",true),
    FAILED("Payment failed", true),
    REFUNDED("Payment refunded", true);
    private final String message;
    private final boolean finalStatus;
    Package(String message, boolean finalStatus){
        this.message = message;
        this.finalStatus = finalStatus;
    }
    public String getMessage() {
        return message;
    }
    public boolean isFinalStatus(){
        return finalStatus;
    }
}
public class Payment {
    public static void main(String[] args) {
        Package p1 = Package.PENDING;
        System.out.println(p1.getMessage());
        System.out.println("Is final: "+ p1.isFinalStatus());
    }
    
}
