package DuckingException;

class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super(message);
    }

}

class UserService {

    public String getUserProfile(String username) throws UserNotFoundException {

        if(username.equals("admin")) {
            return "User access verified";
        }

        throw new UserNotFoundException("User not found with username: " + username);

    }
}

public class Application {

    public static void main(String[] args) {

        UserService user1 = new UserService();

        try {

            String result = user1.getUserProfile("admin");
            System.out.println(result);

        } catch (UserNotFoundException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("User search completed");

        }

    }
}