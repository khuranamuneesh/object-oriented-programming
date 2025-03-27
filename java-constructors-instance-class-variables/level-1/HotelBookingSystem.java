public class HotelBookingSystem
{
    // Attributes of the HotelBooking class
    String guestName;
    String roomType;
    int nights;


    public HotelBookingSystem() // Default constructor
    {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard Room";
        this.nights = 1;
    }

    public HotelBookingSystem(String guestName, String roomType, int nights) // Parameterized constructor
    {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBookingSystem(HotelBookingSystem obj2) {
        this.guestName = obj2.guestName;
        this.roomType = obj2.roomType;
        this.nights = obj2.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        HotelBookingSystem defaultBooking = new HotelBookingSystem();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();
        System.out.println();
        // Creating an object using the parameterized constructor
        HotelBookingSystem customBooking = new HotelBookingSystem("Muneesh Khurana", "Deluxe Room", 2);
        System.out.println("Customer Booking:");
        customBooking.displayBooking();
        System.out.println();
        // Creating an object using the copy constructor
        HotelBookingSystem clonedBooking = new HotelBookingSystem(customBooking);
        System.out.println("Repeat Booking:");
        clonedBooking.displayBooking();
    }
}
