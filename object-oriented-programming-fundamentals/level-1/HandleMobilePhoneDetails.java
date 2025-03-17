import java.util.Scanner;

public class HandleMobilePhoneDetails
{
    public static void main(String[] args)
    {
        MobilePhone obj = new MobilePhone();
        obj.takeUserInput();
        obj.displayDetails();
    }

}

class MobilePhone
{
    String brand;
    String model;
    double price;

    void takeUserInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Brand of Phone: ");
        this.brand = input.nextLine();
        System.out.print("Enter the Model of Phone: ");
        this.model = input.nextLine();
        System.out.print("Enter the Price of Phone: ");
        this.price = input.nextDouble();
    }

    void displayDetails()
    {
        System.out.println("Brand of Phone is: " + this.brand);
        System.out.println("Model of Phone is: " + this.model);
        System.out.println("Price of Phone is: " + this.price);
    }
}
