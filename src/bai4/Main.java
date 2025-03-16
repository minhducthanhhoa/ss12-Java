package bai4;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Diện tích hình tròn (Overriding): " + circle.area());
        System.out.println("Diện tích hình chữ nhật (Overriding): " + rectangle.area());

        Shape shape = new Shape(); // Đối tượng lớp cha
        System.out.println("Diện tích hình tròn (Overloading): " + shape.area(5));
        System.out.println("Diện tích hình chữ nhật (Overloading): " + shape.area(4, 6));
    }
}
