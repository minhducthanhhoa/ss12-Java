package bai10;

public class Cash extends PaymentMethod{
    public Cash() {

    }

    public Cash(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return 0; // Không tính phí
    }

    @Override
    public double processPayment() {
        return amount;
    }
}
