public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories"),
            new Product("P005", "Monitor", "Electronics")
        };


        // Binary Search
        System.out.println("\nBinary Search:");
        Product result = SearchAlgorithms.binarySearch(products, "Monitor");
        System.out.println(result != null ? "Product found: " + result : "Product not found");

        System.out.println("\Linear Search:");
        Product result = SearchAlgorithms.linearSearch(products, "Monitor");
        System.out.println(result != null ? "Product found: " + result : "Product not found");
        
    }
}
