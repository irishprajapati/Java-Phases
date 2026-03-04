package Casting; 
abstract class Machine{ // -> parent class declaration
    abstract public void start();
    abstract public void stop();
    public void displayStatus(){
        System.out.println("Status is showing here...");
    }
}
abstract class Vechile extends Machine{
    @Override
    public void start(){
        System.out.println("Vechile starting");
    }
}

class Car extends Module{
    @Override
    public void stop(){ //implemented from main class 
        //from parent clas(Machine) to child class (Vechile)
        //from parent class(Vechile) to child class (Car)
        System.out.println("Car stopped");
    }
}
public class Main {
    public static void main(String[] args) {
        // Vechile v1 = new Car();
        // v1.stop();
        Machine m = new Car();

    }   
}
