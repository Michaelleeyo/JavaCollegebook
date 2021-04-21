package Chapter4.PC;

public class PC {
    CPU cpu;
    HardDisk HD;

    void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    void setHardDisk(HardDisk HD) {
        this.HD = HD;
    }

    void show() {
        System.out.println("cpu的速度：" + cpu.getSpeed());
        System.out.println("硬盘的容量：" + HD.getAmount());
    }
}
