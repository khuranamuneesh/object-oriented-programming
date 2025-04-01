// Abstract class FoodItem
abstract class FoodItem
{
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice(); // Abstract method for total price

    public void getItemDetails()
    {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

// Interface for discountable items
interface Discountable
{
    void applyDiscount(double discount);
    double getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable
{
    private double discount;

    public VegItem(String itemName, double price, int quantity)
    {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountDetails() {
        return discount;
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 10.0; // Extra charge for non-veg
    private double discount;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + ADDITIONAL_CHARGE - discount;
    }

    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountDetails() {
        return discount;
    }
}

// Main class to test the system
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order =
        {
                new VegItem("Paneer Butter Masala", 200, 2),
                new NonVegItem("Chicken Biryani", 300, 1),
                new NonVegItem("Butter Chicken", 280, 1)
        };

        // Applying discounts
        ((Discountable) order[0]).applyDiscount(20); // Rs. 20 discount on Veg Item
        ((Discountable) order[1]).applyDiscount(30); // Rs. 30 discount on Non-Veg Item
        ((Discountable) order[1]).applyDiscount(0); // zero rupees discount applied on veg
        System.out.println("Order Details -");
        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable)
            {
                System.out.println("Discount Applied: " + ((Discountable) item).getDiscountDetails());
            }
            System.out.println();
        }
    }
}
