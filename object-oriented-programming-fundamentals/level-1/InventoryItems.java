import java.util.Scanner;

public class InventoryItems {
    public static void main(String[] args)
    {
        Item obj = new Item();
        obj.takeUserInput();
        obj.displayItemDetails();
        obj.displayTotalCost();
    }
}

class Item
{
    String itemCode;
    String itemName;
    int price;
    int quantity;

    void takeUserInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Item Code: ");
        this.itemCode = input.nextLine();
        System.out.print("Enter the Item Name: ");
        this.itemName = input.nextLine();
        System.out.print("Enter the price: ");
        this.price = input.nextInt();
        System.out.print("Enter the quantity: ");
        this.quantity = input.nextInt();
    }
    void displayItemDetails()
    {
        System.out.println("The Item Code: " + this.itemCode);
        System.out.println("The Item Name: " + this.itemName);
        System.out.println("The price: " + this.price);
        System.out.println("The quantity: " + this.quantity);
    }
    void displayTotalCost()
    {
        int totalCost = this.price * this.quantity;
        System.out.println("The Total cost of " + this.itemName + " for " + this.quantity + " is: " + totalCost);
    }
}
