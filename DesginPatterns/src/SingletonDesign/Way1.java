package SingletonDesign;

//the simplest approach to make a class singleton OnEager
public class Way1 {
    private static final Way1 instance = new Way1();

    private Way1() {
    }

    public static Way1 getInstance(){
        return instance;
    }

    // this is simple thread safe
    // but problem is that as it instance is created weahter we need or not
    // waste of memeory
}
