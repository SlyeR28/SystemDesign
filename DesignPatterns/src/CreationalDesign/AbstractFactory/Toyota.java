package CreationalDesign.AbstractFactory;

public class Toyota implements Vechile {
    @Override
    public void start() {
        System.out.println("Toyota car start");
    }

    @Override
    public void stop() {
    System.out.println("Toyota car stop");
    }
}
