import Vehicles.*;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "S56", 2006, 526.84, 72.35);
        Truck truck1 = new Truck("Scania", "Unknown", 2001, 1285.34, 200.55, 12.5);
        System.out.println("The car " + car1.getMake() + " model " + car1.getModel() + " has driven " + car1.getMilesDriven()
                + " miles, using " + car1.getFuelConsumed() + " gallons of fuel, setting its fuel efficiency at " + car1.calculateFuelEfficiency() + " miles per gallon");
        System.out.println("The truck " + truck1.getMake() + " model " + truck1.getModel() + " has driven " + truck1.getMilesDriven()
                + " miles, using " + truck1.getFuelConsumed() + " gallons of fuel, carrying an additional cargo of " + truck1.getCargoWeight() + " setting its fuel efficiency at " + truck1.calculateFuelEfficiency() + " miles per gallon");
    }
}