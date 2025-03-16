package bai7;

public class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bus moving at medium speed...");
    }

    @Override
    public void sound() {
        System.out.println("Bus sound: Honk Honk!");
    }
}
