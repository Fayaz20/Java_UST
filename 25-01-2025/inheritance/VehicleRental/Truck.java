package inheritance.VehicleRental;

class Truck extends Vehicle {
    private double loadCapacity; // In tons

    public Truck(String vehicleID, String brand, double rentalPricePerDay, double loadCapacity) {
        super(vehicleID, brand, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        System.out.println("ID: " + getVehicleID());
        System.out.println("Brand: " + getBrand());
        System.out.println("Price per Day: $" + getRentalPricePerDay());
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

