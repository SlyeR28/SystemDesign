package CreationalDesign.FactoryDesign.Vechile;

public class FactoryMethod {
    public static Vechile createVechile(String type){
        if(type.equalsIgnoreCase("Car")){
            return new Car();
        }else if(type.equalsIgnoreCase("Truck")){
            return new Truck();
        }else if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        }else {
            throw new IllegalArgumentException("Invalid Vechile type");
        }
    }
}
