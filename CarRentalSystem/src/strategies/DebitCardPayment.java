package strategies;

public class DebitCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing Debit card payment of " + amount);
        // Implement Debit card payment logic here
        System.out.println("Paid using Debit Card");
        return true;
    }
}
