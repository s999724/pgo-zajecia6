package Vehicles;
public class Truck extends Vehicle {
    public double getCargoWeight() {
        return cargoWeight;
    }
    protected double cargoWeight;
    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year, milesDriven, fuelConsumed);
        this.cargoWeight = cargoWeight;
    }
    @Override
    public double calculateFuelEfficiency() {
        return Math.round((milesDriven / (fuelConsumed + (cargoWeight * 0.5))) * 100) / 100d;
    }
}
