class Book { // Parent Class Book
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (Inherits from Book)
class Author extends Book
{
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);  // Calling superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the Book's displayInfo()
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class to test
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating an Author object (which is also a Book)
        Author book1 = new Author("Gaban", 1928, "Munshi Premchand", "Depiction of Indian villages ");
        Author book2 = new Author("1984", 1949, "George Orwell", "English novelist, famous for dystopian fiction.");
        Author book3 = new Author("The diary of Young Girl", 1943,"Anne Frank","Daily accounts of a teenager hiding with her family during holocaust");
        // Display book and author details
        System.out.println("Book 1 Details:");
        book1.displayInfo();
        System.out.println(); // for new line
        System.out.println("Book 2 Details:");
        book2.displayInfo();
        System.out.println();
        System.out.println("Book 3 Details: ");
        book3.displayInfo();
    }
}
