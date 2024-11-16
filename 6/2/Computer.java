public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String OS;
    private String coolingType;
    private String powerSupply;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setCoolingType(String coolingType) {
        this.coolingType = coolingType;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    public String getOS() {
        return OS;
    }

    public String getCoolingType() {
        return coolingType;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String toString() {
        return "Компьютер: " +
                "CPU - " + CPU +
                ", RAM - " + RAM +
                ", Накопитель - " + storage +
                ", GPU - " + GPU +
                ", ОС - " + OS +
                ", Охлаждение - " + coolingType +
                ", Блок питания - " + powerSupply;
    }
}
