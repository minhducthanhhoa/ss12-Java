package bai9;

public abstract class Vehicle {
    protected String name;

    public Vehicle() {

    }

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void move();
    public abstract void sound();

    public void move(int time, int speed) {
        System.out.println(name + " đã di chuyển được " + (time * speed) + " km.");
    }
}
