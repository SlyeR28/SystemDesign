package CreationDesgin.factoryDesignPattern.FactoryMethod.DocumentReader;

public class testFactory {
    public static void main(String[] args) {
        String type = "pdf";
        Document document = DocumentFactory.createDocument(type);

        if(document != null){
            document.Open(type);
            document.reader(type);
        }else {
            System.out.println("invalid lol");
        }
    }
}
