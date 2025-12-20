package CreationalDesign.AbstractFactory;

public class Honda implements Vechile{
    @Override
    public void start() {
        System.out.println("Honda car start");
    }

    @Override
    public void stop() {
        System.out.println("Honda car stop");
    }
}
