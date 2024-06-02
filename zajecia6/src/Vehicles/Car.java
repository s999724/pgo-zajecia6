package Vehicles;
public class Car extends Vehicle {
    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year, milesDriven, fuelConsumed);
    }
    @Override
    public double calculateFuelEfficiency() {
        return Math.round(milesDriven / fuelConsumed * 100) / 100d;
    }
}
