public class Main {
    public static void main(String[] args) {
        // Create a basic email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the email notifier with SMS and Slack functionalities
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackAndSMSAndEmailNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        // Send a message using the decorated notifier
        slackAndSMSAndEmailNotifier.send("Hello, world!");
    }
}
