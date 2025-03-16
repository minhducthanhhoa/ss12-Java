package bai9;

public class Bike extends Vehicle {
    public Bike() {

    }

    public Bike(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " di chuyển chậm trên đường.");
    }

    @Override
    public void sound() {
        System.out.println(name + " phát ra âm thanh: Ring Ring!");
    }
}
