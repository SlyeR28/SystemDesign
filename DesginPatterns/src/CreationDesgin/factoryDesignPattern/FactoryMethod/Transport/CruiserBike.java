package CreationDesgin.factoryDesignPattern.FactoryMethod.Transport;

public class CruiserBike implements Bike{

    @Override
    public void kickStart() {
        System.out.println("Kick-Starting a Cruiser Bike");
    }

    @Override
    public void drive() {
        System.out.println("Riding a Cruiser Bike ");
    }
}
