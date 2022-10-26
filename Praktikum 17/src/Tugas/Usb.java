package Tugas;

interface UsbFlash {
    void storageMedia();
}

interface Gun {
    void laserPoint();
}

class BallPoint implements Gun,UsbFlash {

    @Override
    public void storageMedia() {

    }

    @Override
    public void laserPoint() {

    }

    public void draw() {

    }
}

