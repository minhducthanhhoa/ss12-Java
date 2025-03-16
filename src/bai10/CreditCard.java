package bai10;

public class CreditCard extends PaymentMethod {
    public CreditCard() {

    }

    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return amount * 0.02; // 2% phí
    }

    @Override
    public double processPayment() {
        return amount + calculateFee();
    }
}
