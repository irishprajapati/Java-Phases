package ConceptUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }
}
class UserService {
    public void ValidateUser(String username) throws UserNotFoundException {
        if (username.equals("admin") | username.equals("manager")) {
            System.out.println("Access granted to " + username);
        } else {
            throw new UserNotFoundException("Credentials unmatched");
        }
    }
}
public class SystemArchitecture {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter username: ");
            String data = br.readLine();
            UserService user1 = new UserService();
            user1.ValidateUser(data);
            } catch (UserNotFoundException | IOException e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("User query searched in database");
            }
        }
    }

