package bai10;

public abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod() {

    }

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract double calculateFee();

    public abstract double processPayment();

    public String processPayment(String currency) {
        return processPayment() + " " + currency;
    }
}
