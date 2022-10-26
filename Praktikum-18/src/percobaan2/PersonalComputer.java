package percobaan2;

class CompactDisk {
}

class Mouse {
}

class OperatingSystem {
}

class MotherBoard {
}

public class PersonalComputer {
    public MotherBoard motherBoard;
    public OperatingSystem os;


    public Mouse mouse;

    public PersonalComputer() {
        this.motherBoard = new MotherBoard();
    }

    public void installOS() {
        this.os = new OperatingSystem();
    }

    public void readData(CompactDisk cd) {
        //cd.read();
    }

    public void detectMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}

class Test {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        CompactDisk disk = new CompactDisk();
        Mouse mouse = new Mouse();
    }
}

