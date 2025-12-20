package FacadeDesignPattern.ComputerStart;

public class ComputerFacade {

    private PowerSupply powerSupply = new PowerSupply();
    private CoolingSystem coolingSystem = new CoolingSystem();
    private Cpu cpu = new Cpu();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();
    private BIOS bios = new BIOS();
    private OperatingSystem operatingSystem = new OperatingSystem();

    public void startComputer() throws InterruptedException {
        System.out.println("Computer Stating.......");
        powerSupply.powerSupply();
        coolingSystem.startCooling();
        bios.boot(cpu , memory);
        hardDrive.spinUp();
        operatingSystem.load();
        System.out.println("Computer started successfully..");

    }
}