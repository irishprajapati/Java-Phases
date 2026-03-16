package inventory;
abstract class Product {
    private int id;
    private String name;
    private double price;
    ProductCategory category; //extracting enum here
    //constructor initialization
    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public ProductCategory getCategory(){
        return  category;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return this.id == product.id;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(this.id);
    }
    @Override
    public String toString(){
        return "ProductId: " + getId() + " Name: " + getName() + " Price: " + getPrice() + " Category: " + getCategory();
    }
    abstract void getDetails();
}
