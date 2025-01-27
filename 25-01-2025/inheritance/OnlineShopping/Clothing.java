package inheritance.OnlineShopping;
class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String productID, String name, double price, String size, String material) {
        super(productID, name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Clothing Product Details:");
        System.out.println("ID: " + getProductID());
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}
