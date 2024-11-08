package creational;
import SoftArchPattern.Ticket;
//Factory Method Pattern a little bit
public class StandardTicketFactory extends TicketFactory {
    public Ticket createTicket(String movieName, String seatNumber, double price) {
        return new Ticket(movieName, seatNumber, price);
    }
}
