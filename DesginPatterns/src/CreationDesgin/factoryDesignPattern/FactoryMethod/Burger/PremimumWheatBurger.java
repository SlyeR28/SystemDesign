package CreationDesgin.factoryDesignPattern.FactoryMethod.Burger;

public class PremimumWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing permimum wheat Burger with Permimum wheat wheat stuff");
    }
}
