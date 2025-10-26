package factoryDesignPattern.SimpleFactory.BurgerShop;

public class MainClass {
    public static void main(String[] args) {
        String type = "basic";

        BurgerFactory burgerFactory = new BurgerFactory();
          Burger burger =  burgerFactory.createBurger(type);

        if(burger != null){
            burger.prepare();
        }
    }
}
