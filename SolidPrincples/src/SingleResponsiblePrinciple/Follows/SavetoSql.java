package SingleResponsiblePrinciple.Follows;

public class SavetoSql implements DbPersistance{

    @Override
    public void save(ShoppingCart cart) throws InterruptedException {
        System.out.println("Saving the data to Sql dB");
        Runnable thread1 = () -> {
            System.out.println("please wait we are saving to MySqlDatabase....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } ;
        Thread thread = new Thread(thread1);
        thread.start();
        thread.join();
        System.out.println("saved...");
    }
}
