class Laptop{
    String brand;
    int price;
    static String name; //why there is static written in front

    public void details(){ //why this method is made 
        System.out.println(brand + ":" + price + " :"+ name);
    }
    static{ //what are the advantages of writing static how many times is it called
        name = "Phone";
        System.out.println("IN static block");
    }

    public Laptop(){ //why to make another class or what is this just public laptop
        brand = "";
        price = 1000;
        System.out.println("In constructor"); //whats the pros and cons of making a constructor here
    }
    // public static void show(Laptop obj){
    //     System.out.println(obj.brand + obj.price);
    // }
}

public class Demo{
    public static void main(String[] args) {
        Laptop obj = new Laptop(); //made the object from the refernce class i understood it
        obj.brand = "apple";
        obj.price = 90000;
        Laptop.name = "mac M1"; //by making the static should we call from class name instead of object name? 
        // Laptop obj1 = new Laptop();
        // Laptop.name = "windows";
        // obj1.price = 100000;
        // obj1.brand = "windows";
        // obj.details();
        // obj1.details();

        // Laptop.show(obj); 

        // Laptop obj = new Laptop();

    }
}  