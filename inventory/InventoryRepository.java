package inventory;

import java.util.List;

interface InventoryRepository {
    void addProduct(Product product);
    Product removeProduct(int productId);
    Product getProduct(int productId);
    List<Product> getAllProducts();
    List<Product> searchByName(String keyword);
    List<Product> getCategory(ProductCategory category);
}
