package factoryDesignPattern.FactoryMethod.Burger;

public class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing Standard burger with Standard stuffs");
    }
}
