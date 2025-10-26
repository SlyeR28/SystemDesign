package factoryDesignPattern.SimpleFactory.BurgerShop;

public class BasicBurger  implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing basic burger with bun , patty , ketchup");
    }

}
