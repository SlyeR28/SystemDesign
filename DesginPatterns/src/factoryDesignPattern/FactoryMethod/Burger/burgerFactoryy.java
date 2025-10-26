package factoryDesignPattern.FactoryMethod.Burger;

public class burgerFactoryy {
    public static void main(String[] args) {
        String type = "basic";

        BurgerFactory burgerFactory = new SinghBurger();
        BurgerFactory burgerFactory1 = new KingBurger();
        Burger burger = burgerFactory.createBurger(type);
        Burger burger1 = burgerFactory1.createBurger(type);
        if(burger != null){
            burger.prepare();
        }
        if(burger1 != null){
            burger1.prepare();
        }

    }
}
