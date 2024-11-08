package structural;
public class PaymentAdapter {
    private ExternalPaymentService externalPaymentService;

    public PaymentAdapter() {
        this.externalPaymentService = new ExternalPaymentService();
    }

    public void makePayment(String cardNumber, double amount) {
        externalPaymentService.processExternalPayment(cardNumber, amount);
        System.out.println("Payment processed successfully through the adapter.");
    }
}