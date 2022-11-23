package no1;

import java.util.Scanner;

public class View {
    public Calculator calculator;
    Scanner scanDiameter = new Scanner(System.in);

    public View() {
        calculator = new Calculator();
    }

    public void showVolume() {
        System.out.println("Volume Bola = " + calculator.countVolume());
    }

    public void inputData() {
        System.out.print("Masukan Diameter : ");
        calculator.generateDiameter(scanDiameter.nextDouble());
    }
}