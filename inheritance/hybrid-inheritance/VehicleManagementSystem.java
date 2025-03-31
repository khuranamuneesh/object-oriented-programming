class Vehicle
{
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed)
    {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable
{
    void refuel();
}

// Subclass ElectricVehicle inheriting from Vehicle
class ElectricVehicle extends Vehicle
{
    private int batteryCapacity; // in kWh

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity)
    {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge()
    {
        System.out.println(model + " is charging with " + batteryCapacity + " kWh battery capacity.");
    }
}

// Subclass PetrolVehicle inheriting from Vehicle and implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable
{
    private int fuelCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity)
    {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel()
    {
        System.out.println(model + " has to refuel with " + fuelCapacity + " liters of petrol.");
    }
}

// Main class
public class VehicleManagementSystem
{
    public static void main(String[] args)
    {
        ElectricVehicle nexon = new ElectricVehicle("Tata Nexon EV", 220, 125);
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 180, 50);
        PetrolVehicle marutiSuzuki = new PetrolVehicle("Maruti Suzuki", 145, 42);

        System.out.println("Vehicle Details:");
        nexon.displayInfo();
        nexon.charge();

        honda.displayInfo();
        honda.refuel();

        marutiSuzuki.displayInfo();
        marutiSuzuki.refuel();
    }
}
