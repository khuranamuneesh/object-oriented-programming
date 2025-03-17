import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.takeUserInput();
        obj.displayDetails();
    }
}

class Student
{
    String name;
    int rollNumber;
    int marks;

    void takeUserInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        this.name = input.nextLine();
        System.out.print("Enter the Roll Number: ");
        this.rollNumber = input.nextInt();
        System.out.print("Enter the Marks: ");
        this.marks = input.nextInt();
    }

    String calculateGrade(int m)
    {
        if(m >= 91 && m <=100)
        {
            return "O-grade";
        }
        else if (m >= 81 && m <= 90)
        {
            return "A-grade";
        }
        else if (m >= 71 && m <= 80)
        {
            return "B-grade";
        }
        else if (m >= 61 && m <= 70)
        {
            return "C-grade";
        }
        else if (m >= 51 && m <= 60)
        {
            return "D-grade";
        }
        else if (m >= 41 && m <= 500)
        {
            return "E-grade";
        }
        else
        {
            return "F-grade";
        }
    }

    void displayDetails()
    {
        System.out.println("Student Details ");
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade Earned: " + calculateGrade(this.marks));
    }
}
