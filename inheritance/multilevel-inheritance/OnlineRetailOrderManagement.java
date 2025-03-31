import java.time.LocalDate;

class Order {
    protected int orderId;
    protected LocalDate orderDate;

    public Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

// Subclass ShippedOrder extending Order
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus() {
        return "Order shipped (Tracking No: " + trackingNumber + ")";
    }
}

// Subclass DeliveredOrder extending ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(int orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Main class to test the hierarchy
public class OnlineRetailOrderManagement {
    public static void main(String[] args)
    {
        Order order1 = new Order(101, LocalDate.of(2025, 1, 5));
        Order order2 = new Order(112, LocalDate.of(2025, 3, 25));
        Order order3 = new Order(107, LocalDate.of(2025, 2, 16));
        Order order4 = new Order(109, LocalDate.of(2025, 2, 21));


        ShippedOrder shippedOrder = new ShippedOrder(102, LocalDate.of(2025, 3, 26), "TRACK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, LocalDate.of(2025, 3, 27), "TRACK67890", LocalDate.of(2025, 3, 29));

        System.out.println("\nOrder Details:");
        order1.displayOrderDetails();
        order2.displayOrderDetails();
        order3.displayOrderDetails();
        order4.displayOrderDetails();

        System.out.println("\nShipped Order Details:");
        shippedOrder.displayOrderDetails();

        System.out.println("\nDelivered Order Details:");
        deliveredOrder.displayOrderDetails();
    }
}
