class CarRental {
    // Attributes of the CarRental class
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Alto";
        this.rentalDays = 1;
        this.dailyRate = 500.0; // Default daily rate
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: Rs" + dailyRate);
        System.out.println("Total Cost: Rs" + calculateTotalCost());
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        CarRental rentedCar1 = new CarRental("Muneesh", "XUV 500", 5, 1500.0);//invoking parameterised constructor
        CarRental rentedCar2 = new CarRental("Akash", "i20", 5, 1000.0);
        CarRental rentedCar3 = new CarRental("Rohan", "Creta", 5, 1250.0);
        rentedCar1.displayRentalDetails();
        rentedCar2.displayRentalDetails();
        rentedCar3.displayRentalDetails();
    }
}
