package CreationDesgin.factoryDesignPattern.FactoryMethod.DocumentReader;

public interface Document {
    void reader(String fileName);

    default void Open(String filename){
        System.out.println("Opening file to read" +filename);
    }
}
