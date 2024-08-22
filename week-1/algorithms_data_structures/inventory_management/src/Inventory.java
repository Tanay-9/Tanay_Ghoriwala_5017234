import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> prod;

    public Inventory() {
        prod = new HashMap<>();
    }

    public void addProduct(Product product) {
        prod.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (prod.containsKey(product.getProductId())) {
            prod.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        prod.remove(productId);
    }

    public Product getProduct(String productId) {
        return prod.get(productId);
    }
}
