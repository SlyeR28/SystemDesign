package CreationalDesign.FactoryDesign.Vechile;

public class Bike implements Vechile {

    @Override
    public void start() {
        System.out.println("Bike start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }

}
