class Employee { // Parent class Employee
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs " + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer subclass
class Developer extends Employee
{
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage)
    {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Intern subclass
class Intern extends Employee
{
    private int duration; // Duration in months

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Rahul", 101, 95000.00, 5);
        Developer developer = new Developer("Aman", 102, 78000.00, "Java");
        Intern intern = new Intern("Kunal", 103, 20000.00, 6);

        System.out.println("Employee Details:\n");
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
