package no2.Controller;

import no2.Model.Cube;

public class CalculatorCube implements Calculator {
    public Cube cube;

    @Override
    public void generateShape(double rusuk) {
        cube = new Cube();
        cube.rusuk = rusuk;
    }

    @Override
    public double calculateVolume() {
        cube.volume = Math.pow(cube.rusuk, 3);
        return cube.volume;
    }
}