package CreationalDesign.AbstractFactory;

public class Mercedes implements Vechile{
    @Override
    public void start() {
        System.out.println("Mercedes started");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes stopped");
    }
}
