package bai7;

public class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike moving slowly...");
    }

    @Override
    public void sound() {
        System.out.println("Bike sound: Ring Ring!");
    }
}
