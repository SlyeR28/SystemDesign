package BridgePattern.Car;

public class Electric implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine powering up silently...");
    }
}
