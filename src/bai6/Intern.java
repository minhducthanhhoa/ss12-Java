package bai6;

public class Intern extends Employee{
    public Intern() {

    }

    public Intern(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thực tập sinh | Lương thực lĩnh: $" + calculateSalary());
    }
}
