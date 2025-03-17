public class EmployeeDetails {
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.name = "Muneesh";
        obj.id = 123;
        obj.salary = 1250000;
        obj.displayDetails();
    }

}

class Employee
{
    String name;
    int id;
    double salary;

    void displayDetails()
    {
        System.out.println("The name of Employee is: " + name);
        System.out.println( name + " id: " + id);
        System.out.println("The salary of " + name + " is: " + salary);
    }
}
