package Line;

import Point.Point;

public class Line {
    public Point firstPoint;
    public Point secondPoint;
    double lenght;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public double getLenght() {
        lenght = Math.sqrt(
                Math.pow((secondPoint.coordinateX - firstPoint.coordinateX), 2) +
                        Math.pow((secondPoint.coordinateY - firstPoint.coordinateY), 2) +
                        Math.pow((secondPoint.coordinateZ - firstPoint.coordinateZ), 2));
        return lenght;
    }
}