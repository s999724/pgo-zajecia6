package Vehicles;
public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double milesDriven;
    protected double fuelConsumed;
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getMilesDriven() {
        return milesDriven;
    }
    public double getFuelConsumed() {
        return fuelConsumed;
    }
    public Vehicle(String make, String model, int year, double milesDriven, double fuelConsumed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }
    public abstract double calculateFuelEfficiency();
}
