class Employee
{
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary)
    {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: Rs" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs" + getSalary());
    }
}

// Subclass demonstrating access to employeeID and department
class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        displayEmployeeDetails(); // Accessing parent class method
        System.out.println("Team Name: " + teamName);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee(101, "HR", 42400.0);
        System.out.println("Employee Details:");
        emp1.displayEmployeeDetails();

        // Modifying salary
        System.out.println("\nUpdating Salary...");
        emp1.setSalary(50000.0);
        emp1.displayEmployeeDetails();

        // Creating a Manager object
        Manager mgr1 = new Manager(201, "IT", 37980.0, "Java Backend");
        System.out.println("\nManager Details:");
        mgr1.displayManagerDetails();
    }
}
