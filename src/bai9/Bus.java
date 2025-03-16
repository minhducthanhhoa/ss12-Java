package bai9;

public class Bus extends Vehicle {
    private int seats;
    public Bus() {

    }

    public Bus(String name, int seats) {
        super(name);
        this.seats = seats;
    }

    @Override
    public void move() {
        System.out.println(name + " chở hành khách di chuyển trên đường.");
    }

    @Override
    public void sound() {
        System.out.println(name + " phát ra âm thanh: Honk Honk!");
    }

    public void showSeats() {
        System.out.println(name + " có " + seats + " ghế ngồi.");
    }

}
