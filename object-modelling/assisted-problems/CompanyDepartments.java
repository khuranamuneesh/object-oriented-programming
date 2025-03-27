import java.util.ArrayList;
import java.util.List;

// Company class containing multiple departments (Composition)
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void removeCompany() {
        System.out.println("Company " + name + " is removed, deleting all departments and employees data");
        departments.clear(); // Removing all department references
    }

    public void showDepartments() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }
}

// Department class containing multiple Employees (Composition)
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void showEmployees() {
        System.out.println("  Department: " + name);
        for (Employee emp : employees) {
            System.out.println("    Employee: " + emp.getName());
        }
    }
}

// Employee class (exists only within a department)
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class CompanyDepartments {
    public static void main(String[] args) {
        Company company = new Company("Generic IT Company");

        // Adding departments
        company.addDepartment("IT");
        company.addDepartment("HR");
        company.addDepartment("Sales");

        // Showing departments before deletion
        company.showDepartments();

        // Deleting the company (composition demonstration)
        company.removeCompany();
        company = null;
        System.gc();

        System.out.println("Company along with all its departments and employees are now removed.");
    }
}
