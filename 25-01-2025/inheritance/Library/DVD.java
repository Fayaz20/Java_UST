
class DVD extends LibraryItem {
    private String director;

    public DVD(String title, String itemID, String director) {
        super(title, itemID);
        this.director = director;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Director: " + director);
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }
}
