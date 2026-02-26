package Constructor;
class airlinedetails{
    private String name;
    private int price;
    private double distance;
    public airlinedetails(){
        name = "AirIndia";
        price = 9000;
        distance = 1909877.99;
        System.out.println("Airline details are here");
    }
    void showInformation(){
        System.out.println("Name: "+ name + " price: " + price + " Distance covered: " + distance);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public double getDistance(){
        return distance;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
}

public class secondairlines {
    public static void main(String[] args) {
        airlinedetails a1 = new airlinedetails();
        airlinedetails a2 = new airlinedetails();
        a2.setName("Malaysia air");
        a2.setPrice(80000);
        a2.setDistance(19999.988);
        a2.getName();
        a2.getPrice();
        a2.getDistance();
        a2.showInformation();
        a1.showInformation();

    }
}
