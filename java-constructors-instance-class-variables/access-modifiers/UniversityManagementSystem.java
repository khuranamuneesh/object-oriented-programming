class Student {
    // Public, Protected, and Private attributes
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0)
        {
            this.CGPA = CGPA;
        }
        else
        {
            System.out.println("Invalid CGPA. It should be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " +  getCGPA());
    }
}

// Subclass demonstrating protected member access
class PostgraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        displayStudentDetails(); // Accessing parent class method
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(4812, "Muneesh", 8.5);
        System.out.println("Student Details:");
        student1.displayStudentDetails();

        // Modifying CGPA
        System.out.println("\nUpdating CGPA...");
        student1.setCGPA(9.0);
        student1.displayStudentDetails();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(2101, "Arjun", 9.2, "Full stack Development");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}
