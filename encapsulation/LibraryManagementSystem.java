// Abstract class LibraryItem
abstract class LibraryItem
{
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author)
    {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration(); // Abstract method for loan duration

    public void getItemDetails()
    {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}

// Interface for reservable items
interface Reservable
{
    void reserveItem();
    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable
{
    public Book(int itemId, String title, String author)
    {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    public void reserveItem() {
        System.out.println("Book reserved successfully.");
    }

    public boolean checkAvailability() {
        return true; // Assume always available
    }
}

// Magazine class
class Magazine extends LibraryItem
{
    public Magazine(int itemId, String title, String author)
    {
        super(itemId, title, author);
    }

    public int getLoanDuration()
    {
        return 7; // Magazines can be loaned for 7 days
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable
{
    public DVD(int itemId, String title, String author)
    {
        super(itemId, title, author);
    }

    public int getLoanDuration()
    {
        return 3; // DVDs can be loaned for 3 days
    }

    public void reserveItem()
    {
        System.out.println("DVD reserved successfully.");
    }

    public boolean checkAvailability() {
        return false; // Assume not available for simplicity
    }
}

// Main class to test the system
public class LibraryManagementSystem
{
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(105, "5 AM Club", "Robin Sharma"),
                new Book(108, "The thousand kites", "Khalid housseini"),
                new Magazine(102, "Tech Today", "Editorial Team"),
                new DVD(103, "Inception", "Christopher Nolan"),
                new DVD(110, "3-Idiots", "Rajkumar Hirani")
        };

        System.out.println("Library Items: ");
        for (LibraryItem item : items)
        {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable)
            {
                ((Reservable) item).reserveItem();
                System.out.println("Available: " + ((Reservable) item).checkAvailability());
            }
            System.out.println();
        }
    }
}
