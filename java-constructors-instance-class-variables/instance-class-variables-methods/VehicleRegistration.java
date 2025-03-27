class Vehicle
{
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared among all instances)
    static double registrationFee = 2000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType)
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails()
    {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs" + registrationFee);
        System.out.println();
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee)
    {
        registrationFee = newFee;
    }
}

    public class VehicleRegistration
    {
        public static void main(String[] args)
        {
            // Creating vehicle objects
            Vehicle vehicle1 = new Vehicle("Muneesh", "Car");
            Vehicle vehicle2 = new Vehicle("Aryan", "Motorcycle");

            // Display initial vehicle details
            System.out.println("Vehicle 1 Details:");
            vehicle1.displayVehicleDetails();

            System.out.println("Vehicle 2 Details:");
            vehicle2.displayVehicleDetails();

            // Update registration fee
            System.out.print("New Registration Fee...");
            Vehicle.updateRegistrationFee(2500.0);
            System.out.println();
            // Display vehicle details after update
            System.out.println("Vehicle 1 Details After Fee Update:");
            vehicle1.displayVehicleDetails();

            System.out.println("\nVehicle 2 Details After Fee Update:");
            vehicle2.displayVehicleDetails();
        }
    }
