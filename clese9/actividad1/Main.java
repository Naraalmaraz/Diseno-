public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();
        PaymentProcessor adapter = new PaymentGatewayAdapter(gateway);

        System.out.println("--- Pago usando el nuevo gateway ---");
        adapter.processPayment(300);
    }
}
