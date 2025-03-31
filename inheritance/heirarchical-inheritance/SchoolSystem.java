// Superclass Person
class Person
{
    protected String name;
    protected int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass Teacher
class Teacher extends Person
{
    private String subject;

    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole()
    {
        System.out.println(name + " is a Teacher of " + subject + ".");
    }
}

// Subclass Student
class Student extends Person
{
    private int grade;

    public Student(String name, int age, int grade)
    {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole()
    {
        System.out.println(name + " is a Student in grade " + grade + ".");
    }
}

// Subclass Staff
class Staff extends Person
{
    private String position;

    public Staff(String name, int age, String position)
    {
        super(name, age);
        this.position = position;
    }

    public void displayRole()
    {
        System.out.println(name + " is a Staff member working as " + position + ".");
    }
}

// Main class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mrs. Kiran", 40, "Mathematics");
        Teacher teacher2 = new Teacher("Mrs Anita", 24, "Hindi");
        Teacher teacher3 = new Teacher("Mr. Raj", 52, "Computer IT");
        Teacher teacher4 = new Teacher("Mr Rishab", 36, "English");

        Student student1 = new Student("Aman", 16, 10);
        Student student2 = new Student("Ajay", 13, 8);
        Student student3 = new Student("Akash", 12, 7);

        Staff staff1 = new Staff("Mrs. Kapoor", 35, "Librarian");
        Staff staff2 = new Staff("Mr Aditya", 35, "Peon");

        System.out.println("The details of teacher: ");
        teacher1.displayInfo();
        teacher1.displayRole();
        teacher2.displayInfo();
        teacher2.displayRole();
        teacher3.displayInfo();
        teacher3.displayRole();
        teacher4.displayInfo();
        teacher4.displayRole();
        System.out.println("-------------------------------\n");
        System.out.println("Student Details: ");
        student1.displayInfo();
        student1.displayRole();
        student2.displayInfo();
        student2.displayRole();
        student3.displayInfo();
        student3.displayRole();
        System.out.println("-------------------------------\n");
        System.out.println("Staff Details: ");
        staff1.displayInfo();
        staff1.displayRole();
        staff2.displayInfo();
        staff2.displayRole();
    }
}
