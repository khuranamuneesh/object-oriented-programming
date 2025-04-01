
abstract class Employee
{
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }

    // Getters
    public int getEmployeeId()
    {
        return employeeId;
    }
    public String getName()
    {
        return name;
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }
}

// Interface for Department
interface Department
{
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Full-time Employee class
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedSalary;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Part-time Employee class
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate)
    {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary()
    {
        return getBaseSalary() + (workHours * hourlyRate);
    }

    public void assignDepartment(String dept)
    {
        this.department = dept;
    }

    public String getDepartmentDetails()
    {
        return "Department: " + department;
    }
}

// Main class to test the system
public class EmployeeManagementSystem
{
    public static void main(String[] args)
    {
        Employee emp1 = new FullTimeEmployee(101, "Aman", 50000, 20000);
        Employee emp2 = new PartTimeEmployee(102, "Bharat", 20000, 50, 200);
        Employee emp3 = new FullTimeEmployee(105,"Nikita",35000,18000);

        ((FullTimeEmployee) emp1).assignDepartment("HR");
        ((PartTimeEmployee) emp2).assignDepartment("IT");
        ((FullTimeEmployee)emp3).assignDepartment("Sales");

        System.out.println("--- Employee Details ---");
        emp1.displayDetails();
        System.out.println(((FullTimeEmployee) emp1).getDepartmentDetails());
        System.out.println();
        emp2.displayDetails();
        System.out.println(((PartTimeEmployee) emp2).getDepartmentDetails());
        System.out.println();
        emp3.displayDetails();
        System.out.println(((PartTimeEmployee) emp3).getDepartmentDetails());
    }
}
