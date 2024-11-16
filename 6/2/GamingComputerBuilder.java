public class GamingComputerBuilder implements IComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void setCPU() {
        computer.setCPU("Intel i9");
    }

    @Override
    public void setRAM() {
        computer.setRAM("32GB");
    }

    @Override
    public void setStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public void setGPU() {
        computer.setGPU("NVIDIA RTX 3080");
    }

    @Override
    public void setOS() {
        computer.setOS("Windows 11");
    }

    @Override
    public void setCooling() {
        computer.setCoolingType("Liquid Cooling");
    }

    @Override
    public void setPowerSupply() {
        computer.setPowerSupply("750W");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
