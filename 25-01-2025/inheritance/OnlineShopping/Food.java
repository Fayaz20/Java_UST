package inheritance.OnlineShopping;
class Food extends Product {
    private String expiryDate; // Format: YYYY-MM-DD
    private double weight; // In kilograms

    public Food(String productID, String name, double price, String expiryDate, double weight) {
        super(productID, name, price);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Food Product Details:");
        System.out.println("ID: " + getProductID());
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Weight: " + weight + " kg");
    }
}
