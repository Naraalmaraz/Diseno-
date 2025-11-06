public class PaymentGatewayAdapter extends PaymentProcessor {
    private PaymentGateway gateway;

    public PaymentGatewayAdapter(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.makePayment(amount, "USD");
        log(amount);
    }

    private void log(double amount) {
        System.out.println("Transacción registrada: $" + amount);
    }
}
