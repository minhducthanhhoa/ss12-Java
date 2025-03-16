package bai6;

public class Employee {
    protected String name;
    protected int age;
    protected double basicSalary;

    public Employee(){

    }

    public Employee(String name, int age, double basicSalary) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary(){
        return basicSalary;
    }

    public void showInfo(){
        System.out.println("Nhân viên: " + name + " | Tuổi: " + age + " | Lương cơ bản: $" + basicSalary);
    }
}
