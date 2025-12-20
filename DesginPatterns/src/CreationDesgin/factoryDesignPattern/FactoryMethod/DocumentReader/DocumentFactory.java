package CreationDesgin.factoryDesignPattern.FactoryMethod.DocumentReader;

public class DocumentFactory {
    public static Document createDocument(String type){
        switch (type.toLowerCase()){
            case "pdf" :
                return new pdf();
            case "excel" :
                return new Excel();
            case "text" :
                return new Text();
            case "word" :
                return new WordReader();
            default:
                System.out.println("invalid file " + type);
                return null;
        }
    }
}
