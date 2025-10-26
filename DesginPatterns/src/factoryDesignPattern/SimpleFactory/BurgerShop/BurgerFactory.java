package factoryDesignPattern.SimpleFactory.BurgerShop;

public class BurgerFactory {

    public Burger createBurger(String type){
        if(type.equalsIgnoreCase("basic")){
          return new BasicBurger();
        } else if (type.equalsIgnoreCase("standard")) {
            return new StandardBurger();
        }else if (type.equalsIgnoreCase("premimum")){
             return new PremimumBurger();
        }else {
            System.out.println("Invalid burger type");
            return null;
        }
    }
}
