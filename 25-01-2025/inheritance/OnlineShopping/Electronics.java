package inheritance.OnlineShopping;
class Electronics extends Product {
    private int warrantyPeriod; // In months

    public Electronics(String productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Electronics Product Details:");
        System.out.println("ID: " + getProductID());
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Warranty: " + warrantyPeriod + " months");
    }
}
