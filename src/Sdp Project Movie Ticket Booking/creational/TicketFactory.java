package creational;
import SoftArchPattern.Ticket;

public abstract class TicketFactory {
    public abstract Ticket createTicket(String movieName, String seatNumber, double price);
}
