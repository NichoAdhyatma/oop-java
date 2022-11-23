package no2.View;

import no2.Controller.CalculatorBall;

public class ViewBall implements View {
    public CalculatorBall calculatorBall;

    public ViewBall() {
        calculatorBall = new CalculatorBall();
    }

    @Override
    public void inputShape() {
        System.out.print("Input Diameter Ball : ");
        calculatorBall.generateShape(input.nextDouble());
    }

    @Override
    public void showVolume() {
        System.out.println("Volume Ball : " + calculatorBall.calculateVolume());
    }
}