package MethodOverriding;
class Vechile{
    public void start(){
        System.out.println("Vechile starting...");
    }
}
class Car extends Vechile{
    @Override
    public void start(){
        System.out.println("Car starting with keys...");
    }
}
class Bike extends Vechile{
    @Override
    public void start(){
        System.out.println("Bike starting with keys");
    }
}
public class Program {
    public static void main(String[] args) {
        Vechile v1 = new Vechile();
        Vechile v2 = new Car();
        Vechile v3 = new Bike();
        v1.start();
        v2.start();
        v3.start();
    }
}
