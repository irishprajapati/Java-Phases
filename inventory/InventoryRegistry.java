package inventory;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
class InventoryRegistry implements InventoryRepository {
    private ConcurrentHashMap<Integer, Product> productMap;
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
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> searchByName(String keyword) {
        return List.of();
    }

    @Override
    public List<Product> getCategory(ProductCategory category) {
        return List.of();
    }


}
