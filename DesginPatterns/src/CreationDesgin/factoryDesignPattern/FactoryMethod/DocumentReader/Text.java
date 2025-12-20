package CreationDesgin.factoryDesignPattern.FactoryMethod.DocumentReader;

public class Text implements Document{

    @Override
    public void reader(String fileName) {
        System.out.println("Reading Content in Text file : " +fileName);
    }
}
