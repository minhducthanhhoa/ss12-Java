package bai7;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car moving fast...");
    }

    @Override
    public void sound() {
        System.out.println("Car sound: Vroom!");
    }
}
