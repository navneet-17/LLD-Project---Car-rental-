package Observer;

public class SMSNotification implements Observer {
    private final String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
        // SMS sending logic here
    }
}
