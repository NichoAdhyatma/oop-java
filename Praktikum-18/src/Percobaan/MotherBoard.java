package Percobaan;

public class MotherBoard {
    private String cpu;

    public MotherBoard() {
        this.cpu = "Intel Core I5-8300H";
    }
    public MotherBoard(String cpu) {
        this.cpu = cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }
}

