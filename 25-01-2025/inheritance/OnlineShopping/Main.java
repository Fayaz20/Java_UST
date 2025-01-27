package inheritance.OnlineShopping;
public class Main {
    public static void main(String[] args) {
        // Create instances of different product types
        Electronics laptop = new Electronics("E101", "Laptop", 1200.00, 24);
        Clothing tShirt = new Clothing("C202", "T-Shirt", 25.00, "M", "Cotton");
        Food bread = new Food("F303", "Bread", 2.50, "2025-02-10", 0.5);

        // Display product details
        System.out.println("** Online Shopping System **\n");

        laptop.displayProductDetails();
        System.out.println();

        tShirt.displayProductDetails();
        System.out.println();

        bread.displayProductDetails();
    }
}

