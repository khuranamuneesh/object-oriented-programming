import java.util.ArrayList;
import java.util.List;

// Abstract class Product
abstract class Product
{
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price)
    {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId()
    {
        return productId;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();

    // Method to calculate final price (polymorphism)
    public double getFinalPrice()
    {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price + tax - discount;
    }

    // Display product details
    public void displayDetails()
    {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

// Interface Taxable
interface Taxable
{
    double calculateTax();

    default void getTaxDetails()
    {
        System.out.println("Tax is applied based on product category.");
    }
}

// Concrete subclass Electronics implementing Taxable
class Electronics extends Product implements Taxable
{
    private int warrantyPeriod; // in months

    public Electronics(int productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount on electronics
    }

    public double calculateTax()
    {
        return getPrice() * 0.18; // 18% GST on electronics
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Category: Electronics, Warranty: " + warrantyPeriod + " months");
    }
}

// Concrete subclass Clothing implementing Taxable
class Clothing extends Product implements Taxable
{
    private String size;

    public Clothing(int productId, String name, double price, String size)
    {
        super(productId, name, price);
        this.size = size;
    }

    public double calculateDiscount()
    {
        return getPrice() * 0.10; // 10% discount on clothing
    }

    public double calculateTax()
    {
        return getPrice() * 0.12; // 12% GST on clothing
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Category: Clothing, Size: " + size);
    }
}

// Concrete subclass Groceries (No Tax)
class Groceries extends Product
{
    private String expiryDate;

    public Groceries(int productId, String name, double price, String expiryDate)
    {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    public double calculateDiscount()
    {
        return getPrice() * 0.05; // 5% discount on groceries
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Category: Groceries, Expiry Date: " + expiryDate);
    }
}

// Main class
public class ECommercePlatform
{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 52000, 24));
        products.add(new Clothing(102, "T-Shirt", 800, "M"));
        products.add(new Groceries(103, "Milk", 64, "2025-02-24"));

        System.out.println("\nProduct Details and Final Prices:");
        for (Product product : products)
        {
            product.displayDetails();
            System.out.println("Final Price (After Discount & Tax): " + product.getFinalPrice() + "\n");
        }
    }
}

