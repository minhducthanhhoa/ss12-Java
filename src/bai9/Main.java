package bai9;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota"),
                new Bike("Honda"),
                new Bus("School Bus", 50),
                new Airplane("Boeing 747", 10000)
        };

        System.out.println("Hệ Thống Phương Tiện Vận Tải");
        for (Vehicle v : vehicles) {
            v.move();
            v.sound();
            v.move(2, 60);
            System.out.println("-------------------------");
        }

        ((Bus) vehicles[2]).showSeats();
        ((Airplane) vehicles[3]).showAltitude();
    }
}
