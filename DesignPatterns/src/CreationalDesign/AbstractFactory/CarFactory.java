package CreationalDesign.AbstractFactory;

public class CarFactory {
    public Vechile createVechile(String brand) {
        if (brand.equalsIgnoreCase("Honda")) {
            return new Honda();
        } else if (brand.equalsIgnoreCase("Toyota")) {
            return new Toyota();
        }else if (brand.equalsIgnoreCase("Bmw")) {
            return new Bmw();
        }else if (brand.equalsIgnoreCase("Mercedes")) {
            return new Mercedes();
        }
        else {
            throw new IllegalArgumentException("Invalid brand");
        }
    }


}
