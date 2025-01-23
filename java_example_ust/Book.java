import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private static List<Book> bookCollection = new ArrayList<>();

    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    // Method to remove a book from the collection
    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }

    // Method to display all books in the collection
    public static void displayBooks() {
        for (Book book : bookCollection) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }

    public static void main(String[] args) {
        // Example usage
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        addBook(book1);
        addBook(book2);

        displayBooks();

        removeBook(book1);

        displayBooks();
    }
}
