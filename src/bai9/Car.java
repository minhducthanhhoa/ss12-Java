package bai9;

public class Car extends Vehicle {
    public Car() {

    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " di chuyển trên đường.");
    }

    @Override
    public void sound() {
        System.out.println(name + " phát ra âm thanh: Vroom!");
    }
}
