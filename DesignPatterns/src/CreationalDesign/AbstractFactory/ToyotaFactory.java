package CreationalDesign.AbstractFactory;

public class ToyotaFactory  implements VechileFactory {
    @Override
    public Vechile createVechile() {
        return new Toyota();
    }
}
