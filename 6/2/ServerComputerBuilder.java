public class ServerComputerBuilder implements IComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void setCPU() {
        computer.setCPU("AMD EPYC 7742");
    }

    @Override
    public void setRAM() {
        computer.setRAM("256GB ECC DDR4");
    }

    @Override
    public void setStorage() {
        computer.setStorage("10TB SAS HDD");
    }

    @Override
    public void setGPU() {
        computer.setGPU("None");
    }

    @Override
    public void setOS() {
        computer.setOS("Ubuntu Server 20.04 LTS");
    }

    @Override
    public void setCooling() {
        computer.setCoolingType("High-Efficiency Air Cooling");
    }

    @Override
    public void setPowerSupply() {
        computer.setPowerSupply("1000W Redundant PSU");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
