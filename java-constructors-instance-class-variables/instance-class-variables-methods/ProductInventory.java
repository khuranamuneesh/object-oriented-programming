public class ProductInventory {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared among all instances)
    static int totalProducts = 0;

    // Constructor
    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts each time a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs" + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        // Creating product objects
        ProductInventory product1 = new ProductInventory("Milk", 65.50);
        ProductInventory product2 = new ProductInventory("Smartphone", 52699.99);

        // Display details of each product
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        // Display total number of products created
        System.out.print("\nInventory Summary:");
        ProductInventory.displayTotalProducts();
    }
}
