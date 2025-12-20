package CreationalDesign.FactoryDesign.Vechile;

public class Truck implements Vechile {
    @Override
    public void start() {
        System.out.println("Truck start");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
    }
}
