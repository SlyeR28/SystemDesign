package factoryDesignPattern.FactoryMethod.Transport;

public class SUV implements Car{
    @Override
    public void openTrunk() {
        System.out.println("Opening a SUV trunk....");
    }

    @Override
    public void drive() {
        System.out.println("Driving SUV .....");
    }
}
