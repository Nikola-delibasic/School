
package computer;

public class Computer {
    private String OS;
    private double processTact;
    private int memory;
    private int hardDrive;

//    Getter's & Setters
    public String getOS() {
        return OS;
    }

    public void setOS(String operatingSystem) {
        this.OS = operatingSystem;
    }

    public double getProcessTact() {
        return processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    public Computer(){    
    }
    
    public Computer(String OS,double processTact, int memory, int hardDrive){
    }
}