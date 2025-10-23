package FacadeDesignPattern.ComputerStart;

public class PowerSupply {
    public void powerSupply() throws InterruptedException {

        try{
            Thread t1 = new Thread (() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Power Supply: Providing Power....");
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            });
            t1.start();
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
