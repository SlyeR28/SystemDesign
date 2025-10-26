package factoryDesignPattern.SimpleFactory.Shapes.Shapes;

public class Triangle implements Shapes{
    @Override
    public void Draw() {
        System.out.println("Drawing three sides called Triangle");
    }
}
