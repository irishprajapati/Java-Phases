package DuckingException;

class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super(message);
    }

}

class UserRepository {

    public String findUser(String username) throws UserNotFoundException {

        if(username.equals("admin")) {
            return "User found";
        }

        throw new UserNotFoundException("User not found: " + username);

    }
}

public class Repository {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        try{
            String user = repo.findUser("adminn");
            System.out.println(user);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage() );
        }finally {
            System.out.println("Searched for userr");
        }
    }
}