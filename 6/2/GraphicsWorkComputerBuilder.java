public class GraphicsWorkComputerBuilder implements IComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void setCPU() {
        computer.setCPU("AMD Ryzen 9 5950X");
    }

    @Override
    public void setRAM() {
        computer.setRAM("64GB");
    }

    @Override
    public void setStorage() {
        computer.setStorage("2TB NVMe SSD");
    }

    @Override
    public void setGPU() {
        computer.setGPU("NVIDIA Quadro RTX 4000");
    }

    @Override
    public void setOS() {
        computer.setOS("Windows 10 Pro");
    }

    @Override
    public void setCooling() {
        computer.setCoolingType("Hybrid Cooling");
    }

    @Override
    public void setPowerSupply() {
        computer.setPowerSupply("850W");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
