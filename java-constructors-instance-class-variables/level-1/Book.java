class Book {
    // Attributes of the Book class
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "ABC";
        this.author = "xyz";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs" + price);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayBook();
        System.out.println();
        // Creating an object using the parameterized constructor
        Book book1 = new Book("Godan", "Premchand", 151.5);
        System.out.println("Custom Book:");
        book1.displayBook();
    }
}
