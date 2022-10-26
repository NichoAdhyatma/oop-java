package Latihan;



class Engine {

}

class Wheel {

}

class Audio {

}

class UsbFlash {

}

public class Car {
    public Engine engine;
    public Wheel wheels;
    public Audio audio;

    public Car() {
        this.engine = new Engine();
    }

    public void PersonalComputer() {

    }

    public void replaceWheel() {
        this.wheels = new Wheel();
    }

    public void installAudio(Audio audio) {
        this.audio = audio;
    }

    public void playMusic(UsbFlash usb) {
        //usb.play();
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car();
        UsbFlash usb = new UsbFlash();
        Audio audio = new Audio();
    }
}

