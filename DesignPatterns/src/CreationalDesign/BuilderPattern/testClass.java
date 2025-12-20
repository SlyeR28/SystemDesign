package CreationalDesign.BuilderPattern;

public class testClass {
    public static void main(String[] args) {
        Car car = new Car("v8" , 4 , 6 , "Red" , false ,false);
        System.out.println(car);

        Car.CarBuilder builder = new Car.CarBuilder();
        Car car1 = builder.
                setEngine("v8")
                .setColour("red")
                .setNavigationSystem(true)
                .setSunroof(true)
                .build();
        System.out.println(car1);

        Car car2 = builder.
                setEngine("V12")
                .setColour("Blue")
                .setWheels(4)
                .setSeats(2)
                .setSunroof(true)
                .setNavigationSystem(true)
                .build();
        System.out.println(car2);
    }
}
