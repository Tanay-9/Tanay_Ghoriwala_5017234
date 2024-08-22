public class Main {
    public static void main(String[] args) {
        // Create PayPalGateway and StripeGateway instances
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for the gateways
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        // Process payments using adapters
        payPalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
    }
}
