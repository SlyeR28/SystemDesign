package factoryDesignPattern.FactoryMethod.Transport;

public class CarFactory extends VechileFactory{


    @Override
    public Vechile createVechile(String model) {
        switch (model.toLowerCase()){
            case "sedan" :
                return new Sedan();
            case "SUV" :
                return new SUV();
            default:
                throw new IllegalArgumentException("Unknown car model" +model);
        }
    }
}
