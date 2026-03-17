package inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
class InventoryRegistry implements InventoryRepository {
    private ConcurrentHashMap<Integer, Product> productMap;
    public InventoryRegistry(){
        this.productMap = new ConcurrentHashMap<>();
    }
    @Override
    public void addProduct(Product product) throws IllegalArgumentException{
       if(product == null){
           throw new IllegalArgumentException("Product cannot be null");
       }
       if(product.getName() == null){
           throw new IllegalArgumentException("Product name cannot be null");
       }
       Product dataInformation = productMap.putIfAbsent(product.getId(),product);
       if( dataInformation != null){
           throw new IllegalArgumentException("ProductId already exists");
       }
    }

    @Override
    public Product removeProduct(int productId) {
        Product removed = productMap.remove(productId);
        if(removed == null){
            throw new IllegalArgumentException("ProductId not found");
        }
        return removed;
    }

    @Override
    public Product getProduct(int productId) {
        Product product = productMap.get(productId);
        if(product == null){
            throw new IllegalArgumentException("Product not found");
        }
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public List<Product> searchByName(String keyword) {
        if (keyword == null) {
            throw new IllegalArgumentException("Keyword cannot be null");
        }
            List<Product> result = new ArrayList<>();
            for (Product product : productMap.values()) {
                if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(product);
                }
        }
        return result;
    }

    @Override
    public List<Product> getCategory(ProductCategory category) {
        if(category == null){
            throw  new IllegalArgumentException("Category cannot be null");
        }
        List<Product> result = new ArrayList<>();
        for(Product product: productMap.values()){
            if(product.getCategory() == category){
                result.add(product);
            }
        }
        return result;
    }
}
