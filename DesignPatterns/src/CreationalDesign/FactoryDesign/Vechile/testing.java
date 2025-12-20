package CreationalDesign.FactoryDesign.Vechile;

public class testing {
    public static void main(String[] args) {
        Vechile vechile1 = FactoryMethod.createVechile("Car");
        vechile1.start();
        vechile1.stop();
    }
}
