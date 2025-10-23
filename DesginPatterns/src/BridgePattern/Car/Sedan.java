package BridgePattern.Car;

public class Sedan extends Car{
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("driving sedan on Moutans....");
    }
}
