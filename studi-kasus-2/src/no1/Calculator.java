package no1;

public class Calculator {
    public Ball ball;

    public void generateDiameter(double diameter) {
        ball = new Ball();
        ball.diameter = diameter;
    }

    public double countVolume() {
        ball.volume =  (4 * Math.PI * Math.pow(ball.diameter * 0.5, 3)) / 3;
        return ball.volume;
    }

}

