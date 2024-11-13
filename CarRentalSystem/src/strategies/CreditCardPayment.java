package strategies;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing credit card payment of " + amount);
        // Implement credit card payment logic here
        System.out.println("Paid using Credit Card");
        return true;
    }
}
