package SingletonDesign;

public class LazySingleton {
    private static LazySingleton instance;

    private  LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    /*
    lazy loading instances will created only when we need so there will be no memory wastage
    but there is problem is that it is not threadSafe
     */
}
