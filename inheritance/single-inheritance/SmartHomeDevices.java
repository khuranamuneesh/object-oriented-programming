// Superclass: Device
class Device {
    protected String deviceId;
    protected boolean status; // true = ON, false = OFF

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        if(status)
        {
            System.out.println("Device is ON");
        }
        else
        {
            System.out.println("Device is OFF");
        }
    }
}

// Subclass: Thermostat (inherits from Device)
class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Subclass: Light (inherits from Device)
class Light extends Device {
    private int brightnessLevel; // Brightness percentage (0-100)

    public Light(String deviceId, boolean status, int brightnessLevel) {
        super(deviceId, status);
        this.brightnessLevel = brightnessLevel;
    }

    public void adjustBrightness(int level) {
        if (status) {
            this.brightnessLevel = level;
            System.out.println("Brightness adjusted to " + level + "%");
        } else {
            System.out.println("Turn on the light first to adjust brightness!");
        }
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Brightness Level: " + brightnessLevel + "%");
    }
}



// Main class to test the functionality
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Creating devices
        Thermostat thermostat = new Thermostat("TH123", true, 24);
        Light livingRoomLight = new Light("L001", true, 75);
        Light bedroomLight = new Light("L002", true, 50);

        // Display device statuses
        System.out.println("Thermostat:");
        thermostat.displayStatus();
        System.out.println();

        System.out.println("Living Room Light:");
        livingRoomLight.displayStatus();
        System.out.println();

        System.out.println("Bedroom Light:");
        bedroomLight.displayStatus();
        bedroomLight.adjustBrightness(80);
        System.out.println();

    }
}
