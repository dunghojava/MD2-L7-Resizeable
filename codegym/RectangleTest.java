package codegym;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        Shape rectangle1 = new Rectangle(3,6);
//        System.out.println("check Area ===== " + (Rectangle));
        System.out.println(((Resizeable) rectangle1).Resize(((Rectangle) rectangle1).getArea()));
        Circle circle1 = new Circle(3);
        System.out.println(circle1.Resize(circle1.getArea()));
    }
}
