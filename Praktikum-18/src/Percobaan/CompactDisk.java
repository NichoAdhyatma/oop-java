package Percobaan;

public class CompactDisk {
    private String disk;
    private final int storage;

    public CompactDisk() {
        this.disk = "SSD Nvme";
        this.storage = 1000;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void read() {
        System.out.println("Disk Size : " + this.storage + " GB");
    }
}