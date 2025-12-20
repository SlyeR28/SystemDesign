package CreationDesgin.factoryDesignPattern.FactoryMethod.Burger;

public class KingBurger implements BurgerFactory{
    @Override
    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("basic")){
           return new BasicWheatBurger();
        } else if (type.equalsIgnoreCase("standard")) {
            return new StandardWheatBurger();
        } else if (type.equalsIgnoreCase("premimum")) {
            return new PremimumWheatBurger();
        }else {
            System.out.println("invalid choice of burger");
            return null;
        }
    }
}
