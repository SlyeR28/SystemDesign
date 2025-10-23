package FacadeDesignPattern.ComputerStart;

public class Memory {

    public void selfTest(){
        try{
            Thread t1 = new Thread (() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Memory : Self test has started....");
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
