package Object;
class Laptop{ //extends the object class automatically
    int price;
    String model;
    @Override
    public String toString() {
        return "Laptop [price=" + price + ", model=" + model + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }
}

public class first {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Macbook";
        obj.price = 100000;
        System.out.println(obj);
        Laptop obj1 = new Laptop();
        obj1.model = "Macbook";
        obj1.price = 100000;
        boolean result = obj.equals(obj1);
        System.out.println(result);
    }
}
