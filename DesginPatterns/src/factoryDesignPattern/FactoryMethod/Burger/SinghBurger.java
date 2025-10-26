package factoryDesignPattern.FactoryMethod.Burger;

public class SinghBurger implements BurgerFactory{


    @Override
    public Burger createBurger(String type) {
     if(type.equalsIgnoreCase("basic")){
         return new BasicBurger();
     }else if (type.equalsIgnoreCase("standard")){
         return new StandardBurger();
     } else if (type.equalsIgnoreCase("premimum")) {
         return new PemimumBurger();
     }else{
         System.out.println("Invalid burger type.....");
         return null;

      }
    }
}
