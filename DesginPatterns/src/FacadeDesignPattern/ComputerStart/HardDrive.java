package FacadeDesignPattern.ComputerStart;

public class HardDrive {

    public void spinUp() {
        try {
            Thread t1 = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("HardDrive : Spinning Up....");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });
            t1.start();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
