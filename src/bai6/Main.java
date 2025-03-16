package bai6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Alice", 30, 3000, 500),
                new PartTimeEmployee("Bob", 22, 15, 80),  // $15/h, làm 80 giờ
                new Intern("Charlie", 20, 1000)
        };

        System.out.println("\nDanh sách nhân viên:");
        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println("--------------------");
        }
    }
}
