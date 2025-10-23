package FacadeDesignPattern.ComputerStart;

public class CoolingSystem {

    public void startCooling() {
        Runnable t1 = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Cooling system: fans ar started");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };
        Thread thread1 = new Thread(t1);
        thread1.start();
    }
}
