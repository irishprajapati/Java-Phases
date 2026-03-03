package BankAccount.Constructor;

class Car{
    String brand;
    int year;
    public Car(String brand, int year){
        if(brand == null){
            throw new IllegalArgumentException("brand required");
        }
        if(year <=0){
            throw new IllegalArgumentException("Invalid year");
        }
        this.brand = brand;
        this.year = year;
    }
    void showDetails(){
        System.out.println("Brand: "+ brand + " Year: " + year);
    }
}
public class level {
    public static void main(String[] args) {
        Car c1 = new Car("Porsche", 2001);
        c1.showDetails();
    }
}
