package Constructor;

class flightDetails{
    private String name;
    private int price;
    private double distance;
    public flightDetails(){
        name = "Buddha Air";
        price = 9000;
        distance = 1909.90;
        System.out.println("Airplane details are here:");
    }
    void showDetails(){
        System.out.println("Name:"+ name + "Amount: " + price + "Distance: "+ distance);
    }
}
public class airlines {
    public static void main(String[] args) {
        flightDetails flight1 = new flightDetails();
        flight1.showDetails();
    }
}
