package bai8;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics("Laptop", 1500),
                new Clothing("T-Shirt", 50),
                new Food("Pizza", 20)
        };

        System.out.println("\nHệ thống bán hàng với chiết khấu:");

        for (Product p : products) {
            System.out.println("\nSản phẩm: " + p.name);
            System.out.println("Giá gốc: $" + p.price);
            System.out.println("Chiết khấu mặc định: " + p.getDiscount() + "%");
            System.out.println("Giá sau chiết khấu: $" + p.getFinalPrice());

            int quantity = 150;
            System.out.println("\nKhi mua " + quantity + " sản phẩm:");
            System.out.println("Chiết khấu: " + p.getDiscount(quantity) + "%");
            System.out.println("Tổng giá: $" + p.getFinalPrice(quantity));
            System.out.println("-----------------------------");
        }
    }
}
