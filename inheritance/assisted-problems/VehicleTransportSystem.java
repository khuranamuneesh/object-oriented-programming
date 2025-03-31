class Vehicle // Superclass Vehicle
{
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Car subclass
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Truck subclass
class Truck extends Vehicle
{
    private double loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double loadCapacity)
    {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    private boolean hasGasExhaust;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGasExhaust) {
        super(maxSpeed, fuelType);
        this.hasGasExhaust = hasGasExhaust;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gas Exhaust: " + (hasGasExhaust ? "Yes" : "No"));
    }
}

// Main class
public class VehicleTransportSystem
{
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(150, "Petrol", false);

        System.out.println("Vehicle Details:\n");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
