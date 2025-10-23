package SingleResponsiblePrinciple.Follows;

public class CarDbStorage {
    private ShoppingCart cart;

    public CarDbStorage() {
    }

    public CarDbStorage(ShoppingCart cart) {
        this.cart = cart;
    }
     public void savetoDatabase(ShoppingCart cart){
         System.out.println("Saving shopping cart to database..");
         System.out.println("cart saved to database directly...");
     }
     public void savetoDatabaseMongo(ShoppingCart cart) throws InterruptedException {
         System.out.println("Saving the data to mongo dB");
         Runnable thread1 = () -> {
             System.out.println("please wait we are saving to Mongodatabse....");
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
     public void savetoDatabaseFile(ShoppingCart cart) throws InterruptedException {
         System.out.println("Saving the data to file dB");
         Runnable thread1 = () -> {
             System.out.println("please wait we are saving to file....");
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

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }
}

// here we are add new features of saving the cart to different so we are directly add the new feature to existing class
// by modifying it hence we are breaking the principle of OPEN CLOSE PRINCIPLE(as it says that A  class should not open
// for extension and modification)





