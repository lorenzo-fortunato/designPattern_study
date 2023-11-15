package domain;

public class ComputerFacade {
    CPU cpu;
    Memory memory;
    HardDrive hardDrive;

    public void startComputer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void executeProgram(int programSize) {
        memory.load(0, hardDrive.read(0, programSize));
        cpu.jump(0);
        cpu.execute();
    }

    public void shutdown() {
        memory.dump();
        hardDrive.stop();
        cpu.freeze();
        cpu.stop();
    }
}
