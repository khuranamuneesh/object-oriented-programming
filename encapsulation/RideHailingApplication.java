// Abstract class Vehicles
abstract class Vehicles {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicles(int vehicleId, String driverName, double ratePerKm)
    {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance); // Abstract method for fare calculation

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public int getVehicleId()
    {
        return vehicleId;
    }
    public String getDriverName()
    {
        return driverName;
    }
    public double getRatePerKm()
    {
        return ratePerKm;
    }
}

// Interface for GPS functionality
interface GPS
{
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// CarRide class
class CarRide extends Vehicles implements GPS
{
    private String location;

    public CarRide(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance)
    {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation()
    {
        return location;
    }

    @Override
    public void updateLocation(String newLocation)
    {
        this.location = newLocation;
    }
}

// BikeRide class
class BikeRide extends Vehicles implements GPS
{
    private String location;

    public BikeRide(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // Discounted fare for bikes
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Auto class
class Auto extends Vehicles implements GPS {
    private String location;

    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "random";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.5; // Slightly higher fare for autos
    }

    @Override
    public String getCurrentLocation()
    {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Main class to test the system
public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicles[] rides = {
                new CarRide(101, "Muneesh", 10),
                new BikeRide(102, "Agaam", 5),
                new Auto(103, "Kartik", 7)
        };

        System.out.println("--- Ride Details ---");
        for (Vehicles ride : rides) {
            ride.getVehicleDetails();
            System.out.println("Fare for 10 km: " + ride.calculateFare(10));
            if (ride instanceof GPS) {
                ((GPS) ride).updateLocation("Panchkula");
                System.out.println("Current Location: " + ((GPS) ride).getCurrentLocation());
            }
            System.out.println();
        }
    }
}