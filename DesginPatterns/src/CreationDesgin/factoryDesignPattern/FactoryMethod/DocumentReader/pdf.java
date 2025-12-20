package CreationDesgin.factoryDesignPattern.FactoryMethod.DocumentReader;

public class pdf implements Document{

    @Override
    public void reader(String fileName) {
        System.out.println("reading content in pdf file : " +fileName);
    }
}
