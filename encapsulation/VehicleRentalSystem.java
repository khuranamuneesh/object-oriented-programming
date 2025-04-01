// Abstract class Vehicle
abstract class Vehicle
{
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate)
    {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayVehicleDetails()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }

    public String getVehicleNumber()
    {
        return vehicleNumber;
    }
    public String getType()
    {
        return type;
    }
    public double getRentalRate()
    {
        return rentalRate;
    }
}

// Interface for Insurable vehicles
interface Insurable
{
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable
{
    private String insurancePolicy;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicy)
    {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    public double calculateRentalCost(int days)
    {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% of rental rate
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicy;
    }
}

// Bike class
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate)
    {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    public double calculateRentalCost(int days)
    {
        return getRentalRate() * days * 1.2; // 20% additional charge for trucks
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicy;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("CH01XX1234", 1200, "SBI-INS-046513801"),
                new Bike("HR03YZ9876", 550),
                new Truck("PB65ZX4561", 2400, "TATAAIG-INS-086153202")
        };

        System.out.println("Vehicle Details and Rental Costs:");
        for (Vehicle vehicle : vehicles)
        {
            vehicle.displayVehicleDetails();
            int rentalDays = 5;
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0;

            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            if (vehicle instanceof Insurable)
            {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
                System.out.println("Insurance Cost: " + insuranceCost);
            }
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println();
        }
    }
}
