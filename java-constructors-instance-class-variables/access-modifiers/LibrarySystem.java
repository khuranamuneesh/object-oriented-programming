class Book {
    // Public, Protected, and Private attributes
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get author name
    public String getAuthor() {
        return author;
    }

    // Public method to set author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass demonstrating access to ISBN and title
class EBook extends Book {
    private double fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public attribute
        System.out.println("Title: " + title); // Accessing protected attribute
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("2110994812", "The 5AM Club", "Muneesh");
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Modifying author name
        System.out.println("\nUpdating Author...");
        book1.setAuthor("Robin Sharma");
        book1.displayBookDetails();

        // Creating an EBook object
        EBook ebook1 = new EBook("970134569", "Mathematics", "RD Sharma", 2.5);
        System.out.println("\nE-Book Details:");
        ebook1.displayEBookDetails();
    }
}
