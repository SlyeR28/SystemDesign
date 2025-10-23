package FacadeDesignPattern.ComputerStart;

public class BIOS {

    public void boot(Cpu cpu , Memory memory) throws InterruptedException {
        System.out.println("BIOS : Booting Cpu and Memory Checks......");
        cpu.initializer();
        memory.selfTest();
    }
}
