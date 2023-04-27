public class Main {
    public static void main(String[] args) {
            MovablePoint point = new MovablePoint(0, 0);
            System.out.println("Vị trí ban đầu: (" + point.getX() + ", " + point.getY() + ")");
            point.moveUp();
            point.moveRight();
            System.out.println("Vị trí mới: (" + point.getX() + ", " + point.getY() + ")");
    }
}