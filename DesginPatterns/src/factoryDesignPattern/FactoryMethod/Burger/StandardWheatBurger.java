package factoryDesignPattern.FactoryMethod.Burger;

public class StandardWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing Standard Wheat burger with standard wheat stuffs");
    }
}
