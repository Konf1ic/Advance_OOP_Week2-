package shapes;

public class Square extends Rectangle {

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ", side=" + getWidth() + "]";
    }
}