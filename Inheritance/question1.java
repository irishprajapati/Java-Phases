package Inheritance;
class Animal{
    public void eat(){
        System.out.println("Eats");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Barks");
    }
}

public class question1{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        }
    }
    
