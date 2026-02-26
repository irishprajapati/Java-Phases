package Constructor;
class Human{
    private int age;
    private String name;
    public Human()// this is default constructor
    {
        System.out.println("In constructor");
    }
    public Human(int a, String n){
        age = a;
        name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human(19,"erish");
        h2.getAge();
        h2.getName();
    }
}
