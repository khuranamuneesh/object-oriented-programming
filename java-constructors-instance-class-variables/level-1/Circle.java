public class Circle
{
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with a default value
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius,2.0D);
    }

    // Method to display circle details
    public void displayCircle() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayCircle();

        // Creating an object using the parameterized constructor
        Circle Circle1 = new Circle(7);
        System.out.println("\nNew Circle:");
        Circle1.displayCircle();
    }
}