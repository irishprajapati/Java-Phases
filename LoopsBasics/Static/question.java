//object and class specific
class Car{
    String Model;//car can have different models
    static String brand; //but it would have same brand like porsche is a brand but it have different models
    
    public void details(){
        System.out.println(Model +" : " + brand);
    }
}
public class question{
    public static void main(String[] args) {
        Car.brand = "Toyota"; //assigning the brand static value refernce with the class
        Car car1 = new Car();
        Car car2 = new Car();
        car1.Model = "Corola";
        car1.details();
        car2.Model = "camry";
        car2.details();
    }
}
