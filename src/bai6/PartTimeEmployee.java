package bai6;

public class PartTimeEmployee extends Employee {
    private int hoursworked;

    public PartTimeEmployee() {

    }

    public PartTimeEmployee(String name, int age,double basicSalary, int hoursworked) {
        super(name, age, basicSalary);
        this.hoursworked = hoursworked;
    }

    @Override
    public double calculateSalary() {
        return basicSalary * hoursworked;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Nhân viên Part-time | Giờ làm: " + hoursworked + " | Lương thực lĩnh: $" + calculateSalary());
    }
}
