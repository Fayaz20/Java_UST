abstract class LibraryItem {
    private String title;
    private boolean isAvailable;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.isAvailable = true; // Default status
    }

    public String getTitle() {
        return title; // Getter for the title
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void checkIn() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is already available.");
        }
    }

    public abstract void displayDetails();

    public boolean isAvailable() {
        return isAvailable;
    }
}
