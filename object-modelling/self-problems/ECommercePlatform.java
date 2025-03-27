import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Order class (Aggregation with Product)
class Order {
    private int orderId;
    private static int orderCount = 0;
    private List<Product> products;

    public Order() {
        this.orderId = ++orderCount;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.print("Products in Order:");
        for (Product product : products)
        {
            System.out.println("  - " + product.getName() + " (Rs" + product.getPrice() + " INR )");
        }
        System.out.println();
    }
}

// Customer class (Association with Order)
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder() {
        Order order = new Order(); // Create a new order for each customer
        orders.add(order);
        System.out.println(name + " placed an order (Order ID: " + order.getOrderId() + ")");
    }

    public void addProductToOrder(int orderIndex, Product product) {
        if (orderIndex < orders.size()) {
            orders.get(orderIndex).addProduct(product);
        } else {
            System.out.println("Invalid order index for " + name);
        }
    }

    public void showCustomerOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Aryan");
        Customer customer2 = new Customer("Virat");
        Customer customer3 = new Customer("Kunal");

        Product product1 = new Product("Laptop", 133200.00);
        Product product2 = new Product("Smartphone", 42800.00);
        Product product3 = new Product("Headphones", 1150.00);

        customer1.placeOrder();
        customer1.addProductToOrder(0, product1);
        customer1.addProductToOrder(0, product2);

        customer2.placeOrder();
        customer2.addProductToOrder(0, product3);

        customer3.placeOrder();
        customer3.addProductToOrder(0, product3);

        System.out.println("\nCustomer Order details below");
        customer1.showCustomerOrders();
        customer2.showCustomerOrders();
        customer3.showCustomerOrders();
    }
}
