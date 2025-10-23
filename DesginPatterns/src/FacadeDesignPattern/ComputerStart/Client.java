package FacadeDesignPattern.ComputerStart;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
    }
}
