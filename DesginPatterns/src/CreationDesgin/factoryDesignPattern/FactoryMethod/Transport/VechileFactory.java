package CreationDesgin.factoryDesignPattern.FactoryMethod.Transport;

public abstract class VechileFactory {

    public abstract Vechile createVechile(String model);

    public void deliverVehicle(String model) {
        Vechile vehicle = createVechile(model);
        System.out.println("\nPreparing your vehicle...");
        vehicle.drive();
        System.out.println("Vehicle delivered successfully ✅");
    }
}
