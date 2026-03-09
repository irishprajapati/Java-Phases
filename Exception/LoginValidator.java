package Exception;
class InvalidCredentialException extends Exception{
    public InvalidCredentialException(String message){
        super(message);
    }
}
class CheckCredentials {
    public void login(String username, String password) throws InvalidCredentialException{
        if(username =="admin" && password =="1234"){
            System.out.println("Login successful");
        }
        else{
            throw new InvalidCredentialException("login credentials incorrect");
        }
    }
}
public class LoginValidator{
    static void main(String[] args) {
        CheckCredentials user1 = new CheckCredentials();
        try{
            user1.login("admin", "1234");
        }catch(InvalidCredentialException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong :  " + e);
        }finally {
            System.out.println("Login attempt recorded");
        }
    }
}