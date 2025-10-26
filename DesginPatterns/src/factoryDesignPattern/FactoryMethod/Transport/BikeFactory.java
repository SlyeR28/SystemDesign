package factoryDesignPattern.FactoryMethod.Transport;

public class BikeFactory extends VechileFactory{
    @Override
    public Vechile createVechile(String model) {
        switch (model.toLowerCase()){
            case "cruiser":
                return new CruiserBike();
            case "sports":
                return new SprotsBike();
            default:
                throw new IllegalArgumentException("Bike not found" +model);
        }
    }
}
