package Cube;

import Square.Square;

public class Cube {
    public Square[] squares;
    public double volume;

    public Cube(Square[] squares) {
        this.squares = squares;
    }

    public double getVolume() {
        volume = Math.pow(squares[0].lines[0].getLenght(), 3);
        return volume;
    }
}