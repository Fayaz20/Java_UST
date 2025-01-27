package inheritance.VehicleRental;

public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicle types
        Car car = new Car("C101", "Toyota Camry", 50.00, 5, true);
        Bike bike = new Bike("B202", "Yamaha R15", 15.00, "Sport", true);
        Truck truck = new Truck("T303", "Ford F-150", 120.00, 2.5);

        // Display vehicle details
        System.out.println("** Vehicle Rental System **\n");

        car.displayDetails();
        System.out.println("Total Rental Cost for 3 Days: $" + car.calculateRentalCost(3));
        System.out.println();

        bike.displayDetails();
        System.out.println("Total Rental Cost for 2 Days: $" + bike.calculateRentalCost(2));
        System.out.println();

        truck.displayDetails();
        System.out.println("Total Rental Cost for 5 Days: $" + truck.calculateRentalCost(5));
    }
}
