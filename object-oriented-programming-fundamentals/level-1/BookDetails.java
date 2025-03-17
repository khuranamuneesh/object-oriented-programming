import java.util.*;

public class BookDetails {
    public static void main(String[] args)
    {
        Book obj = new Book();
        obj.takeUserInput();
        obj.displayDetails();
    }
}

class Book
{
    String title;
    String author;
    int price;

    void takeUserInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the title of book: ");
        this.title = input.nextLine();
        System.out.print("Enter the author of book: ");
        this.author = input.nextLine();
        System.out.print("Enter the price of book: ");
        this.price = input.nextInt();
    }

    void displayDetails()
    {
        System.out.println("Title of Book is: " + this.title);
        System.out.println("Author of Book is: " + this.author);
        System.out.println("Price of Book is: " + this.price);
    }
}
