package strategies;

public class UPIPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing UPI payment of " + amount);
        // Implement credit card payment logic here
        System.out.println("Paid using UPI");
        return true;
    }
}
