package CreationDesgin.factoryDesignPattern.SimpleFactory.BurgerShop;

public class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing standard burger with buns , patty , suauces ,grills...");
    }
}
