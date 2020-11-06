package D1016;

class PC {
    CPU cpu;
    HardDisk HD;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    
    public void setHD(HardDisk hD) {
        HD = hD;
    }

    void show() {
        System.out.println("CPU: " + cpu.speed + " HD: " + HD.amount);
    }
}

class CPU {
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

class HardDisk {
    int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
}
public class Test {
    public static void main(String[] args) {
        CPU c = new CPU();
        c.setSpeed(2200);
        HardDisk h = new HardDisk();
        h.setAmount(200);
        PC p = new PC();
        p.setCpu(c);
        p.setHD(h);
        p.show();
    }
}
