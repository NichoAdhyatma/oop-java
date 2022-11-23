package no2.Controller;

import no2.Model.Ball;

public class CalculatorBall implements Calculator {
    public Ball ball;
    @Override
    public void generateShape(double diameter) {
        ball = new Ball();
        ball.diameter = diameter;
    }

    @Override
    public double calculateVolume() {
        ball.volume = (4 * Math.PI * Math.pow(ball.diameter * 0.5, 3)) / 3;
        return ball.volume;
    }
}