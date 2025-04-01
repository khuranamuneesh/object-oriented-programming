// Abstract class Patient
abstract class Patient
{
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age)
    {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill(); // Abstract method for bill calculation

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
}

// Interface for Medical Records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int daysAdmitted;
    private String medicalHistory;

    public InPatient(int patientId, String name, int age, double roomCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = "No records yet.";
    }

    public double calculateBill() {
        return roomCharge * daysAdmitted;
    }

    public void addRecord(String record) {
        this.medicalHistory = record;
    }

    public void viewRecords()
    {
        System.out.println("Medical History: " + medicalHistory);
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord
{
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(int patientId, String name, int age, double consultationFee)
    {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "No records yet.";
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record)
    {
        this.medicalHistory = record;
    }

    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

// Main class to test the system
public class HospitalPatientManagementSystem
{
    public static void main(String[] args)
    {
        Patient[] patients = {
                new InPatient(101, "Akash", 45, 2000, 5),
                new InPatient(123, "Azhar", 27, 5000, 2),
                new OutPatient(156, "Kiran", 30, 500),
                new OutPatient(156, "Neel", 21, 800),
                new OutPatient(156, "Ryan", 30, 350)
        };

        System.out.println("Patient Details: ");
        for (Patient elements : patients) {
            elements.getPatientDetails();
            System.out.println("Total Bill: " + elements.calculateBill());
            if (elements instanceof MedicalRecord)
            {
                ((MedicalRecord) elements).addRecord("Routine Checkup");
                ((MedicalRecord) elements).viewRecords();
            }
            System.out.println();
        }
    }
}
