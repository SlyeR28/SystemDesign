package CreationDesgin.factoryDesignPattern.FactoryMethod.DocumentReader;

public class Excel implements Document{

    @Override
    public void reader(String fileName) {
        System.out.println("reading content in Excel file : " +fileName);
    }
}
