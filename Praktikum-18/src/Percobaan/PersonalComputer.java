package Percobaan;

public class PersonalComputer {

    public MotherBoard motherBoard;
    public OperatingSystem OperatingSystem;
    public Mouse Mouse;

    public PersonalComputer() {
        this.motherBoard = new MotherBoard();
    }

    public void installOS() {
        this.OperatingSystem = new OperatingSystem();
    }

    public void readData(CompactDisk CompactDisk) {
        CompactDisk.read();
    }

    void detectMouse(Mouse Mouse) {
        this.Mouse = Mouse ;
    }

}
