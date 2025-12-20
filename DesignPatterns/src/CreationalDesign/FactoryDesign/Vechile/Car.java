package CreationalDesign.FactoryDesign.Vechile;

public class Car implements Vechile {
    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
}
