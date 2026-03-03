package Vechile;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Porsche";
        c1.pricePerDay = 19000;
        c1.carDetails();
        c1.displayInfo();
        Bike b1 = new Bike();
        b1.name = "Duke";
        b1.pricePerDay = 1000;
        b1.bikeDetails();
        b1.displayInfo();
    }
}
