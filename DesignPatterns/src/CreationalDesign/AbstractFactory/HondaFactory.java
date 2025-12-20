package CreationalDesign.AbstractFactory;

public class HondaFactory implements VechileFactory {
    @Override
    public Vechile createVechile() {
        return new Honda();
    }
}
