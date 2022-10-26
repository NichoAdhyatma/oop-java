package Percobaan;

public class Test {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        Mouse mouse = new Mouse();
        CompactDisk disk = new CompactDisk();

        pc.installOS();
        pc.detectMouse(mouse);
        pc.readData(disk);

    }
}