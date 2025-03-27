
import java.util.ArrayList;
import java.util.List;

// Hospital class to manage doctors and patients
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}

// Doctor class
class Doctor {
    private String name;
    private int id;
    private static int doctorCount = 0; // Static variable to track doctor count
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.id = ++doctorCount; // Assign unique ID using static variable
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + this.name + " is consulting patient " + patient.getName());
    }

    public String getName() {
        return name;
    }
}

// Patient class
class Patient {
    private String name;
    private int id;
    private static int patientCount = 0; // Static variable to track patient count
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.id = ++patientCount; // Assign unique ID using static variable
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public String getName() {
        return name;
    }
}

// Main class
public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doc1 = new Doctor("Karan");
        Doctor doc2 = new Doctor("Arjun");

        Patient pat1 = new Patient("Rohan");
        Patient pat2 = new Patient("Kavita");
        Patient pat3 = new Patient("Piyush");
        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);
        hospital.addPatient(pat3);
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat3);
    }
}
