package bai9;

public class Airplane extends Vehicle {
    private int altitude;

    public Airplane() {

    }

    public Airplane(String name, int altitude) {
        super(name);
        this.altitude = altitude;
    }

    @Override
    public void move() {
        System.out.println(name + " bay trên không trung ở độ cao " + altitude + " mét.");
    }

    @Override
    public void sound() {
        System.out.println(name + " phát ra âm thanh: Whoosh!");
    }

    public void showAltitude() {
        System.out.println(name + " đang bay ở độ cao " + altitude + " mét.");
    }
}
