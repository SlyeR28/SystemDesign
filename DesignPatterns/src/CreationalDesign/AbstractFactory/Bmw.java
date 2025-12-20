package CreationalDesign.AbstractFactory;

public class Bmw implements Vechile{
    @Override
    public void stop() {
        System.out.println("Bmw stop");
    }

    @Override
    public void start() {
        System.out.println("Bmw start");
    }
}
