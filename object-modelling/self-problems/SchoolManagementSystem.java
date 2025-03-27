import java.util.ArrayList;
import java.util.List;

class School
{
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            student.showCourses();
        }
    }
}

// Student class (Association - can enroll in multiple courses)
class Student
{
    String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void showCourses() {
        System.out.println("  Student: " + name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("    Course: " + course.getName());
        }
    }
}

// Course class (Association - can have multiple students)
class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public String getName() {
        return name;
    }

    public void showStudents() {
        System.out.println("Course: " + name + " has enrolled students:");
        for (Student student : students) {
            System.out.println("  " + student.name);
        }
    }
}

// Main class
public class SchoolManagementSystem {
    public static void main(String[] args) {
        School school = new School("DPS School");

        Student student1 = new Student("Muneesh");
        Student student2 = new Student("John");
        Student student3 = new Student("Vikas");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");
        Course hindi = new Course("Hindi");
        Course evs = new Course("Environmental Science");

        student1.enroll(math);
        student1.enroll(science);
        student1.enroll(english);
        student1.enroll(evs);

        student2.enroll(math);
        student2.enroll(hindi);
        student2.enroll(science);
        student2.enroll(evs);

        student3.enroll(english);
        student3.enroll(evs);

        school.addStudent(student1);
        school.addStudent(student2);

        school.showStudents();
        math.showStudents();
        science.showStudents();
        evs.showStudents();
        english.showStudents();
    }
}
