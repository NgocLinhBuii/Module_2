package ss6_inheritance_polymorphism.thuc_hanh;

public class ShapeTest{
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("green", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle2 = new Circle(3.5, "indigo", false);
        System.out.println(circle2);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
