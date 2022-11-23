package no2.View;

import no2.Controller.CalculatorCube;

public class ViewCube implements View {
    public CalculatorCube calculatorCube;

    public ViewCube() {
        calculatorCube = new CalculatorCube();
    }

    @Override
    public void inputShape() {
        System.out.print("Input Cube Shape : ");
        calculatorCube.generateShape(input.nextDouble());
    }

    @Override
    public void showVolume() {
        System.out.println("Volume Cube : " + calculatorCube.calculateVolume());
    }
}