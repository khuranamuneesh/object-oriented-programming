import java.util.ArrayList;

// Book class represents the details of a book
class Book {
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods for book details
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Library class represents the library which aggregates books
class Library {
    private String libraryName;
    private ArrayList<Book> books; // List of books in the library

    // Constructor to initialize the library with its name
    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>(); // Initializing the books list
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book); // Adding a book to the library
    }

    // Method to display the library details and its books
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books available in this library:");
        for (Book book : books) {
            book.displayBookDetails(); // Displaying each book's details
            System.out.println("----------------------------");
        }
    }
}

// Main class to test the aggregation between Library and Book
public class LibraryAndBooks {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("Gulliver Travels", "Max Publishers");
        Book book3 = new Book("Godan", "Premchand");

        Library library1 = new Library("Central State Library");
        Library library2 = new Library("City Public Library");

        // Adding books to libraries (demonstrating aggregation)
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        // Displaying library details and their books
        library1.displayLibraryDetails();
        library2.displayLibraryDetails();
    }
}
