package Inheritance1;
//this was simple program lets add the simple getter and setter method
class Animal{
    private String name;
    public void eat(){
        System.out.println("Eating....");
    }
    public void showDetails(){
        System.out.println("Name: " + name);
    }
    public void SetName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Barking...");
    }
}
public class first {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.SetName("Brownie");
        dog.showDetails();
        dog.eat();
        dog.bark();
    }    
}
