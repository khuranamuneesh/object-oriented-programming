class Course
{
    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable (shared among all instances)
    static String instituteName = "ABC Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration of course: " + duration + " weeks");
        System.out.println("Fee: Rs" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName)
    {
        instituteName = newName;
    }
}

public class OnlineCourseManagement
    {
        public static void main(String[] args) {
            // Creating course objects
            Course course1 = new Course("Java Programming", 8, 1500.0);
            Course course2 = new Course("Web Development", 12, 3600.0);

            // Display initial course details
            System.out.println("Course 1 Details:");
            course1.displayCourseDetails();

            System.out.println("\nCourse 2 Details:");
            course2.displayCourseDetails();

            // Update institute name
            System.out.println("\nUpdating Institute Name...\n");
            Course.updateInstituteName("Chitkara University");

            // Display course details after update
            System.out.println("Course 1 Details After Update:");
            course1.displayCourseDetails();

            System.out.println("\nCourse 2 Details After Update:");
            course2.displayCourseDetails();
        }
    }


