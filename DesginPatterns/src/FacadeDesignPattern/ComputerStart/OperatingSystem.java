package FacadeDesignPattern.ComputerStart;

public class OperatingSystem {

    public void load(){
        try{
            Thread t1 = new Thread (() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Operating System  : Loading into Memory....");
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