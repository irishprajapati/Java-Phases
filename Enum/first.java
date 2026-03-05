package Enum;
enum Laptop{
    Macbook(2000), lenevo(1900), dell(700), surface(500);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

}
public class first {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + lap.getPrice());
    }
    
}
