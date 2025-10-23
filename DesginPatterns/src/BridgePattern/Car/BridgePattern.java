package BridgePattern.Car;

public class BridgePattern {
    public static void main(String[] args) {
        Engine petrol = new Petrol();
        Engine diesel = new Desiel();
        Engine electic = new Electric();

        Car mySedan = new Sedan(petrol);
        Car mySuv = new SUV(diesel);
        Car yourSedan = new Sedan(electic);

        mySedan.drive();
        mySuv.drive();
        yourSedan.drive();
    }
}
