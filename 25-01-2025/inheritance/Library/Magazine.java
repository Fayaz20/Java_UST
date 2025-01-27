
class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String itemID, int issueNumber) {
        super(title, itemID);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }
}
