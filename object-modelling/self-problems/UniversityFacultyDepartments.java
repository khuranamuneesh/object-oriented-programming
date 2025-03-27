import java.util.ArrayList;
import java.util.List;

// University class (Composition with Department, Aggregation with Faculty)
class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println("  - " + department.getName());
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : faculties) {
            System.out.println("  - " + faculty.getName());
        }
    }

    public void closeUniversity() {
        System.out.println("Closing University: " + name);
        departments.clear(); // Deleting all departments (Composition)
    }
}

// Department class (Composition - Exists only within University)
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Faculty class (Aggregation - Faculty can exist independently)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class UniversityFacultyDepartments {
    public static void main(String[] args) {
        University university = new University("Dholakpur University");

        Department cs = new Department("Computer Science");
        Department pharmacy = new Department("Pharmacy");
        Department law = new Department("Law");
        Faculty prof1 = new Faculty("Prof. Sheetal");
        Faculty prof2 = new Faculty("Prof. Shyam");
        Faculty prof3 = new Faculty("Prof. Tarun");
        Faculty prof4 = new Faculty("Prof. Arun");
        Faculty prof5 = new Faculty("Prof. Mohan");
        university.addDepartment(cs);
        university.addDepartment(pharmacy);
        university.addDepartment(law);
        university.addFaculty(prof1);
        university.addFaculty(prof2);
        university.addFaculty(prof3);
        university.addFaculty(prof4);
        university.addFaculty(prof5);
        university.showDetails();

        // Deleting the university (removes all departments but faculty still exists)
        university.closeUniversity();
        university.showDetails();
    }
}
