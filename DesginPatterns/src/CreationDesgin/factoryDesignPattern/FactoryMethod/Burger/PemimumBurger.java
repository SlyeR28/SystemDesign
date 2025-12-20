package CreationDesgin.factoryDesignPattern.FactoryMethod.Burger;

public class PemimumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing Premimum burger with premimum Stuff");
    }
}
