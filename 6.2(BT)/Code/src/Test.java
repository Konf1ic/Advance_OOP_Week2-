public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());

        System.out.println();

        Rectangle rectangle = new Rectangle(2.0, 3.0);
        System.out.println("Diện tích HCN: " + rectangle.getArea());
        System.out.println("Chu vi HCN: " + rectangle.getPerimeter());
    }
}