import java.util.Scanner;

public class ComputeAreaCircle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        Circle obj = new Circle();
        obj.radius = input.nextInt();
        obj.displayArea(obj.radius);
        obj.displayCircumference(obj.radius);
    }
}

class Circle
{
    int radius;

   void displayArea(int r)
   {
       double area = Math.PI * r * r;
       System.out.println("The area of the circle: " + area);
   }

    void displayCircumference(int r)
    {
        double circumference = Math.PI * 2 * r;
        System.out.println("The circumference of the circle: " + circumference);
    }
}