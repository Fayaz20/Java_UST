public class Main {
    public static void main(String[] args) {
        // Create instances of LibraryItem subclasses
        Book book = new Book("The Great Gatsby", "B101", "F. Scott Fitzgerald");
        Magazine magazine = new Magazine("National Geographic", "M202", 150);
        DVD dvd = new DVD("Inception", "D303", "Christopher Nolan");

        // Display details and perform actions
        System.out.println("**Library Items Details**");
        book.displayDetails();
        book.checkOut();
        book.displayDetails();
        book.checkIn();
        book.displayDetails();

        System.out.println();

        magazine.displayDetails();
        magazine.checkOut();

        System.out.println();

        dvd.displayDetails();
        dvd.checkOut();
        dvd.checkIn();
    }
}
