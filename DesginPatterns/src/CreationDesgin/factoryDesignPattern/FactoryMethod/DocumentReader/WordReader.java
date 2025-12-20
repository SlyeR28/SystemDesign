package CreationDesgin.factoryDesignPattern.FactoryMethod.DocumentReader;

public class WordReader implements Document {

    @Override
    public void reader(String fileName) {
        System.out.println("reading word file content : " +fileName);
    }
}
