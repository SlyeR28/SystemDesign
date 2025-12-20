package CreationalDesign.AbstractFactory;

public class MercedesFactory implements VechileFactory {
    @Override
    public Vechile createVechile() {
        return new Mercedes();
    }
}
