package structural;
//Adapter Pattern used
public class ExternalPaymentService {
    public void processExternalPayment(String cardNumber, double amount) {
        System.out.println("Processing payment of $" + amount + " using card: " + cardNumber + " through an external service.");
    }
}