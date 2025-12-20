package CreationalDesign.FactoryDesign.Vechile;

public class Mainnns {
    public static void main(String[] args) {
        Vechile vechile1 = new Car();
        vechile1.start();
        vechile1.stop();
        Vechile vechile2 = new Bike();
        vechile2.start();
        vechile2.stop();
        Vechile vechile3 = new Truck();
        vechile3.start();
        vechile3.stop();

    }
}
