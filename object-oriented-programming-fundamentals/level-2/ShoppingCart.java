import java.util.Objects;
import java.util.Scanner;

public class ShoppingCart
{
    public static void main(String[] args)
    {
        CartItem obj= new CartItem();
        obj.cartMenu();
    }
}

class CartItem
{
    String itemName;
    double price;
    int quantity;
    double totalMoney =0.0;
    String[] cartItemsList = new String[100];
    int index=0;

    void cartMenu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Shopping Cart");
        System.out.println("Enter 1 to add items \nEnter 2 to remove item \nEnter 3 to Press Money \nEnter 4 to Exit");

        while(true)
        {
            int num = input.nextInt();
            if(num ==1)
            {
                addItem();
            }
            else if (num == 2)
            {
                removeItem();
            }
            else if (num == 3)
            {
                displayTotalCost();
            }
            else
            {
                System.exit(0);
            }
        }
    }

    void addItem()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of item to be added: ");
        this.itemName = input.nextLine();
        System.out.println("Enter the quantity of item to be added: ");
        this.quantity = input.nextInt();
        System.out.println("Enter the price of each item: ");
        this.price = input.nextInt();
        this.totalMoney = this.totalMoney + (price * quantity);
        cartItemsList[index] = this.itemName;
        index++;
        System.out.println("Item added");
    }
    void removeItem()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of item to be removed: ");
        this.itemName = input.nextLine();
        System.out.println("Enter the quantity of item to be removed: ");
        this.quantity = input.nextInt();
        System.out.println("Enter the price of each item: ");
        this.price = input.nextInt();
        this.totalMoney = this.totalMoney - (price * quantity);
        for(int i=0; i< cartItemsList.length; i++)
        {
            if (Objects.equals(this.itemName, cartItemsList[index]))
            {
                cartItemsList[index] = "item removed";
            }
        }
        System.out.println("Item Removed successfully");
    }

    void displayTotalCost()
    {
        System.out.println("The total cost of cart: " + this.totalMoney);
    }
}