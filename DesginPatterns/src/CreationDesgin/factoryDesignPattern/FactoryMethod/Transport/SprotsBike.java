package CreationDesgin.factoryDesignPattern.FactoryMethod.Transport;

public class SprotsBike implements Bike{
    @Override
    public void kickStart() {
        System.out.println("Kick-Starting a Sports bike");
    }

    @Override
    public void drive() {
        System.out.println("driving a Sports bike on High speed....");
    }
}
