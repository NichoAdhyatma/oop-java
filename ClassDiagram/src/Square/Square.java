package Square;

import Line.Line;

public class Square {
    public Line[] lines;
    public double area;

    public Square(Line[] lines) {
        this.lines = lines;
    }

    public double getArea() {
        area = lines[0].getLenght() + lines[1].getLenght();
        return area;
    }
}