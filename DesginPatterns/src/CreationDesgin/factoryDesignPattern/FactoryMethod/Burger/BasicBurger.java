package CreationDesgin.factoryDesignPattern.FactoryMethod.Burger;

public class BasicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing basic burger with basic stuffs");
    }
}
