public class Main {
    public static void main(String[] args) {
        // Test MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveDown();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
        // Test MovableCircle
        MovableCircle circle = new MovableCircle(0, 0, 2, 2, 3);
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
    }
}
