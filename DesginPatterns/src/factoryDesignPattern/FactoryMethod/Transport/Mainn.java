package factoryDesignPattern.FactoryMethod.Transport;

public class Mainn {
    public static void main(String[] args) {
        VechileFactory carFactory = new CarFactory();
        Car car =  (Car) carFactory.createVechile("sedan");
        car.drive();
        car.openTrunk();
        VechileFactory bikeFactory = new BikeFactory();
        Bike sports = (Bike) bikeFactory.createVechile("sports");
        sports.drive();
        sports.kickStart();

        VechileFactory truckFactory = new TruckFactory();
        Truck heavy = (Truck) truckFactory.createVechile("heavy");
        heavy.drive();
        heavy.loadCargo();

    }
}
