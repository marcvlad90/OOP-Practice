package categories.abstractclasses;

public class Square extends Rectangle {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format("Square with side %s, color %s, and filled=%b", this.side, this.color,
                this.filled);
    }
}
