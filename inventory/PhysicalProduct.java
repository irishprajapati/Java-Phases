package inventory;

class StockAvailabilityException extends Exception {
    public StockAvailabilityException(String message) {
        super(message);
    }
}

class PhysicalProduct extends Product {

    private double weight;
    private int stockQuantity;

    public PhysicalProduct(int id, String name, double price, double weight, int stockQuantity) {
        super(id, name, price);
        this.weight = weight;
        this.stockQuantity = stockQuantity;
    }

    public void increaseStock(int amount) throws StockAvailabilityException {

        if (amount <= 0) {
            throw new StockAvailabilityException("Stock amount must be greater than zero");
        }

        stockQuantity += amount;
    }

    public void decreaseStock(int amount) throws StockAvailabilityException {

        if (amount <= 0) {
            throw new StockAvailabilityException("Stock amount must be greater than zero");
        }

        if (amount > stockQuantity) {
            throw new StockAvailabilityException("Not enough stock available");
        }

        stockQuantity -= amount;
    }

    @Override
    public void getDetails() {
        System.out.println("Physical Product: " + getName() +
                ", Weight: " + weight +
                ", Stock: " + stockQuantity);
    }
}