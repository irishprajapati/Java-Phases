package Exception;
class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}
class AgeVerification{
    public void regsiterUser(int age) throws  UnderAgeException{
        if(age < 18){
            System.out.println("User must be 18 years or Older");
        }else{
            System.out.println("Registration successful");
        }
        System.out.println("Registration attempt logged");
    }
}
public class VerificationAge {
    static void main(String[] args) {
    AgeVerification user1 = new AgeVerification();
    try{
        user1.regsiterUser(19);
    } catch (UnderAgeException e) {
        throw new RuntimeException(e.getMessage());
    }
    finally {
        System.out.println("Operation executed");
    }
    }
}
