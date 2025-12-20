package CreationalDesign.AbstractFactory;

public class BWMfactory implements  VechileFactory {
    @Override
    public Vechile createVechile() {
        return new Bmw();
    }
}
