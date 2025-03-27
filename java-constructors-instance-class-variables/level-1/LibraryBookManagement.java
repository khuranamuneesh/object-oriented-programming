public class LibraryBookManagement {
    // Attributes of the Book class
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Parameterized constructor
    public LibraryBookManagement(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook()
    {
        if (isAvailable)
        {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        }
        else
        {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs" + price);
        if(isAvailable)
        {
            System.out.println("Available");
        }
        else
        {
            System.out.println("Not Available");
        }
    }

    public static void main(String[] args) {
        // Creating a book object
        LibraryBookManagement book1 = new LibraryBookManagement("Godan", "Premchand", 239.29, true);
        LibraryBookManagement book2 = new LibraryBookManagement("Concepts of Physics", "HC Verma", 478.19, false);
        // Display book details
        book1.displayBook();
        System.out.println();
        book2.displayBook();
        System.out.println();
        System.out.println("Trying to borrow the book...");
        book1.borrowBook();
        book2.borrowBook();
        System.out.println();
        // Display book details after borrowing
        System.out.println("Details after borrowing:");
        book1.displayBook();
        System.out.println();
        book2.displayBook();
    }
}

