package bai7;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(),
                new Bike(),
                new Bus()
        };

        System.out.println("\nHệ thống giao thông:");
        for (Vehicle v : vehicles) {
            v.move();
            v.sound();
            System.out.println("--------------------");
        }
    }
}
