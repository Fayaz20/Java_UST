package inheritance.VehicleRental;

class Car extends Vehicle {
    private int seatingCapacity;
    private boolean isAutomatic;

    public Car(String vehicleID, String brand, double rentalPricePerDay, int seatingCapacity, boolean isAutomatic) {
        super(vehicleID, brand, rentalPricePerDay);
        this.seatingCapacity = seatingCapacity;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("ID: " + getVehicleID());
        System.out.println("Brand: " + getBrand());
        System.out.println("Price per Day: $" + getRentalPricePerDay());
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Automatic: " + (isAutomatic ? "Yes" : "No"));
    }
}

