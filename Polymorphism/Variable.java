package Polymorphism;

class User{
    final int userID;
    String name;
    public User(int userID){
        this.userID = userID;
    }
    public void showDetails(){
        System.out.println("User with ID: " + userID + " Name of user: " + name);
    }
}
public class Variable {
    public static void main(String[] args) {
        User u1 = new User(100);
        u1.name = "erish";
        u1.showDetails();
    }
}
