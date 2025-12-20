package CreationDesgin.factoryDesignPattern.FactoryMethod.Transport;

public class TruckFactory extends VechileFactory{
    @Override
    public Vechile createVechile(String model) {
        switch (model.toLowerCase()){
            case "pickup" :
                return new PickUpTrucks();
            case "heavy":
                return new HeavyTruck();
            default:
                throw new IllegalArgumentException("truck not found ..");
        }
    }
}
