package factoryDesignPattern.FactoryMethod.Transport;

public class HeavyTruck implements Truck{

    @Override
    public void loadCargo() {
        System.out.println("Loading heavy cargo...");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Heavy truck.....");
    }
}
