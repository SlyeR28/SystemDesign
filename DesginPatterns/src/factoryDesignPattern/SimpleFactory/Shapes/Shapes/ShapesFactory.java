package factoryDesignPattern.SimpleFactory.Shapes.Shapes;

public class ShapesFactory {

    public Shapes drawShape(String type){
         if(type.equalsIgnoreCase("circle")){
             return new Circle();
         } else if (type.equalsIgnoreCase("rectangle")) {
             return new Recatangle();
         }else if (type.equalsIgnoreCase("triangle")) {
             return new Triangle();
         }else if (type.equalsIgnoreCase("square")) {
             return new Square();
         }else {
             System.out.println("invalid ");
             return null;
         }
    }
}
