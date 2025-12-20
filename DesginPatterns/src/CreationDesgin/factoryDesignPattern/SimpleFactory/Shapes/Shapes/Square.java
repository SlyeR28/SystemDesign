package CreationDesgin.factoryDesignPattern.SimpleFactory.Shapes.Shapes;

public class Square  implements Shapes{
    @Override
    public void Draw() {
        System.out.println("Drawing four sides that are equals to each other and 90 degree with each other called square");
    }
}
