package Vechile;

class Car extends Vechile{
    private int seatingCapacity;
    public int getSeatCapacity(){
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity){
        this.seatingCapacity = seatingCapacity;
    }
    public void carDetails(){
        System.out.println("Car has seating space of: " + " people");
    }
}
class Bike extends Vechile{
    private int engineCapacity;
    public void bikeDetails(){
        System.out.println("Bie have engine capacity of: " + engineCapacity );
    }
    public int getEngineCapacity(){
        return engineCapacity;
    }
    public void setEngineCapacity(int engineCapacity){
        this.engineCapacity = engineCapacity;
    }
}
public class Rentals{
    public static void main(String[] args) {
        Car c1 = new Car();
    }
}
