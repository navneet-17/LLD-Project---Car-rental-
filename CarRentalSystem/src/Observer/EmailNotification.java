package Observer;

public class EmailNotification implements Observer {
    private final String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Sending email to " + email + ": " + message);
        // Email sending logic here
    }
}
