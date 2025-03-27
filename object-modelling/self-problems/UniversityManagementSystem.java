import java.util.ArrayList;
import java.util.List;

// Courses class
class Courses {
    private String courseName;
    private Professor professor;
    private List<Students> enrolledStudents;

    public Courses(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " is assigned to teach " + courseName);
    }

    public void enrollStudent(Students student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has enrolled in " + courseName);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Students student : enrolledStudents) {
            System.out.println("  - " + student.getName());
        }
    }
}

// Students class (Association with Courses)
class Students {
    private String name;
    private List<Courses> courses;

    public Students(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Courses course) {
        courses.add(course);
        course.enrollStudent(this); // Corrected method call
    }

    public void showEnrolledCourses()
    {
        System.out.print("Student: " + name + " is enrolled in:");
        for (Courses course : courses)
        {
            System.out.println(" " + course.getCourseName() + " ");
        }
    }
}

// Professor class (Aggregation with Courses)
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Students student1 = new Students("Aman");
        Students student2 = new Students("Naman");
        Students student3 = new Students("Raman");

        Professor professor1 = new Professor("Dr. Sharma");
        Professor professor2 = new Professor("Dr. Mehta");

        Courses course1 = new Courses("Data Structures"); // Renamed `Course` to `Courses`
        Courses course2 = new Courses("Cyber Security");
        Courses course3 = new Courses("AI- Artificial Intelligence");

        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);
        course3.assignProfessor(professor1);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student3.enrollCourse(course2);

        System.out.println("\nCourse Details:");
        course1.showCourseDetails();
        course2.showCourseDetails();
        course3.showCourseDetails();

        System.out.println("\nStudent Details:");
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
        student3.showEnrolledCourses();
    }
}
