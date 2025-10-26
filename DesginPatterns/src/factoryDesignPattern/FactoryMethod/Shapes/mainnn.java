package factoryDesignPattern.FactoryMethod.Shapes;

public class mainnn {
    public static void main(String[] args) {
        String type = "rectangle";

        ShapesFactory shapesFactory = new ShapesFactory();
         Shapes shapes = shapesFactory.drawShape(type);

         if (shapes != null){
             shapes.Draw();
         }

    }
}
