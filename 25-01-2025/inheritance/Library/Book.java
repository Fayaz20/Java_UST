
class Book extends LibraryItem {
    private String author;

    public Book(String title, String itemID, String author) {
        super(title, itemID);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }
}
