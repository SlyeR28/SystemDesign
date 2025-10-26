package factoryDesignPattern.SimpleFactory.BurgerShop;

public class PremimumBurger  implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing premimum Burger with patty , suaces , buns and buns");
    }
}
