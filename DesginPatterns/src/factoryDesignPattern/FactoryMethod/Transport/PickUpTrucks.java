package factoryDesignPattern.FactoryMethod.Transport;

public class PickUpTrucks implements Truck{
    @Override
    public void loadCargo() {
        System.out.println("Loading cargo in the pickUp truck");
    }

    @Override
    public void drive() {
        System.out.println("Driving a pickup truck for transporting..");
    }
}
