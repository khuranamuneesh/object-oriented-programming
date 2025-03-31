
class Course //parent class
{
    String courseName;
    int duration; // in weeks

    public Course(String courseName, int duration)
    {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails()
    {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse (inherits from Course)
class OnlineCourse extends Course
{
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Platform Name: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse
{
    double fee;
    double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount)
    {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayDetails() {
        super.displayDetails();
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Fee: Rs" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price after discount: Rs" + finalPrice);
    }
}

// Main class to test the hierarchy
public class EducationalCourseHierarchy
{
    public static void main(String[] args)
    {
        Course basicCourse1 = new Course("Mathematics", 6);
        Course basicCourse2 = new Course("Modern History", 11);
        Course basicCourse3 = new Course("Social Science", 12);
        Course basicCourse4 = new Course("Biology", 9);

        OnlineCourse onlineCourse1 = new OnlineCourse("Java Programming", 8, "Udemy", true);
        OnlineCourse onlineCourse2 = new OnlineCourse("SQl", 8, "Edx", false);
        OnlineCourse onlineCourse3 = new OnlineCourse("Operating System", 8, "Udemy", true);

        PaidOnlineCourse paidCourse1 = new PaidOnlineCourse("Cyber Security", 10, "Coursera", true, 2010, 20);
        PaidOnlineCourse paidCourse2 = new PaidOnlineCourse("UI/UX", 24, "Google Learning", true,754,15);
        PaidOnlineCourse paidCourse3 = new PaidOnlineCourse("HTML and CSS", 5, "W3 Schools", false, 1199, 33);

        System.out.println("Basic Course:");
        basicCourse1.displayDetails();
        System.out.println();
        basicCourse2.displayDetails();
        System.out.println();
        basicCourse3.displayDetails();
        System.out.println();
        basicCourse4.displayDetails();
        System.out.println("----------------------------------------\n");
        System.out.println("Online Course:");
        onlineCourse1.displayDetails();
        System.out.println();
        onlineCourse2.displayDetails();
        System.out.println();
        onlineCourse3.displayDetails();
        System.out.println("----------------------------------------\n");
        System.out.println("Paid Online Course:");
        paidCourse1.displayDetails();
        System.out.println();
        paidCourse2.displayDetails();
        System.out.println();
        paidCourse3.displayDetails();
    }
}
