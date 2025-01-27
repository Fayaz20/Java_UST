package inheritance.VehicleRental;

class Bike extends Vehicle {
    private String type; // e.g., "Sport", "Cruiser", etc.
    private boolean hasHelmetIncluded;

    public Bike(String vehicleID, String brand, double rentalPricePerDay, String type, boolean hasHelmetIncluded) {
        super(vehicleID, brand, rentalPricePerDay);
        this.type = type;
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Details:");
        System.out.println("ID: " + getVehicleID());
        System.out.println("Brand: " + getBrand());
        System.out.println("Price per Day: $" + getRentalPricePerDay());
        System.out.println("Type: " + type);
        System.out.println("Helmet Included: " + (hasHelmetIncluded ? "Yes" : "No"));
    }
}

