package Casting;
abstract class Vechile{
    public final void fixedBehavior(){
        //mentioning the method what should do first
        start();
        stop();
    }
    void start(){
        System.out.println("Vechile started");
    }
    void stop(){
        System.out.println("vechile stopped");
    }
}

class Car extends Vechile{
    @Override
    void start(){
        System.out.println("Car started");
    }
    @Override
    void stop(){
        System.out.println("Car stopped");
    }
}

public class Module {
    
}
