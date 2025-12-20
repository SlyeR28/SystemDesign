package CreationalDesign.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Vechile vechile = carFactory.createVechile("Mercedes");
        vechile.start();
        vechile.stop();


        VechileFactory hondaFactory = new HondaFactory();
        Vechile honda  = hondaFactory.createVechile();
        honda.start();
        honda.stop();
    }
}
