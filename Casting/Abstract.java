package Casting;
abstract class Car{
    public abstract void drive(); //declaring method
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play music");
    }
}
abstract class GWagon extends Car{
    @Override
    public void drive(){
        System.out.println("Gwagon driving...");
    }
}
class UpdatedGWagon extends GWagon{ //concrete class
    @Override
    public void fly(){
        System.out.println("Flying");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Car c1 = new UpdatedGWagon();
        c1.drive();
        c1.playMusic();
    }
}
