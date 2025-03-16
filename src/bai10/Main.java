package bai10;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(1000);
        PaymentMethod debitCard = new DebitCard(1000);
        PaymentMethod cash = new Cash(1000);

        // Xuất kết quả
        System.out.println("--- Credit Card ---");
        System.out.println("Total Payment (CreditCard): " + creditCard.processPayment());
        System.out.println("Processed payment of 1000.0 USD with total: " + creditCard.processPayment("USD"));

        System.out.println("\n--- Debit Card ---");
        System.out.println("Total Payment (DebitCard): " + debitCard.processPayment());
        System.out.println("Processed payment of 1000.0 EUR with total: " + debitCard.processPayment("EUR"));

        System.out.println("\n--- Cash ---");
        System.out.println("Total Payment (Cash): " + cash.processPayment());
        System.out.println("Processed payment of 1000.0 JPY with total: " + cash.processPayment("JPY"));
    }
}
