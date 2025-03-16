package bai5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.area());
        }
    }
}
