import shapes.Circle;
import shapes.Shape;
import shapes.Rectangle;
import shapes.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle("red", true, 5.0);
        System.out.println(shape1.toString());
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Perimeter: " + shape1.getPerimeter());

        Shape shape2 = new Rectangle("blue",false ,3.0 , 4.0);
        System.out.println(shape2.toString());
        System.out.println("Area: " + shape2.getArea());
        System.out.println("Perimeter: " + shape2.getPerimeter());

        Shape shape3 = new Square("green", true,5.0,6.0);
        System.out.println(shape3.toString());
        System.out.println("Area: " + shape3.getArea());
        System.out.println("Perimeter: " + shape3.getPerimeter());
    }
}