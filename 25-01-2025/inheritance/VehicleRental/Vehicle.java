package inheritance.VehicleRental;

abstract class Vehicle {
    private String vehicleID;
    private String brand;
    private double rentalPricePerDay;

    public Vehicle(String vehicleID, String brand, double rentalPricePerDay) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public abstract void displayDetails();

    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }
}

