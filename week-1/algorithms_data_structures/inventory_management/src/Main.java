import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    Product newProduct = new Product(productId, productName, quantity, price);
                    inventory.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    productId = scanner.nextLine();
                    Product existingProduct = inventory.getProduct(productId);

                    if (existingProduct != null) {
                        System.out.print("Enter New Product Name: ");
                        productName = scanner.nextLine();
                        System.out.print("Enter New Quantity: ");
                        quantity = scanner.nextInt();
                        System.out.print("Enter New Price: ");
                        price = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline

                        existingProduct.setProductName(productName);
                        existingProduct.setQuantity(quantity);
                        existingProduct.setPrice(price);
                        inventory.updateProduct(existingProduct);
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    productId = scanner.nextLine();
                    inventory.deleteProduct(productId);
                    System.out.println("Product deleted successfully.");
                    break;

                case 4:
                    System.out.print("Enter Product ID to view: ");
                    productId = scanner.nextLine();
                    Product product = inventory.getProduct(productId);

                    if (product != null) {
                        System.out.println("Product ID: " + product.getProductId());
                        System.out.println("Product Name: " + product.getProductName());
                        System.out.println("Quantity: " + product.getQuantity());
                        System.out.println("Price: " + product.getPrice());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        }
    }
}
