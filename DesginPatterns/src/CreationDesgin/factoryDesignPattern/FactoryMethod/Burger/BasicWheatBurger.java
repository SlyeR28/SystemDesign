package CreationDesgin.factoryDesignPattern.FactoryMethod.Burger;

public class BasicWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing Basic wheat burger with basic wheat stuffs");
    }
}
