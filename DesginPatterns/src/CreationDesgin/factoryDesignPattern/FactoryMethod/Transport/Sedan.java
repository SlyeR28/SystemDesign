package CreationDesgin.factoryDesignPattern.FactoryMethod.Transport;

public class Sedan implements Car{

    @Override
    public void drive() {
        System.out.println("Driving a Sedan");
    }

    @Override
    public void openTrunk() {
        System.out.println("Opening sedan trunk....");
    }
}
