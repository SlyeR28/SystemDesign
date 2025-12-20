package CreationDesgin.SingletonDesign;

public class ThreadSafeWay2 {

    private static ThreadSafeWay2  thread = null;

    private ThreadSafeWay2() {
    }

    public static ThreadSafeWay2 getThread(){
        if(thread == null){
            synchronized (ThreadSafeWay2.class){
                if(thread == null){
                    thread = new ThreadSafeWay2();
                }
            }
        }
        return thread;
    }
}
