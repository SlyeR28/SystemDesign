package FacadeDesignPattern.ComputerStart;

public class Cpu {

    public void initializer() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(500);
                System.out.println("Cpu: Initialization has Started...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t1.join();
    }
}
