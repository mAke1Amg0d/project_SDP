package structural;
import SoftArchPattern.Ticket;
import creational.DatabaseConnection;
import creational.StandardTicketFactory;
import creational.TicketFactory;
// Facade Pattern used

public class BookingFacade {
    private TicketFactory ticketFactory = new StandardTicketFactory();
    private DatabaseConnection dbConnection = DatabaseConnection.getInstance();

    public Ticket bookTicket(String movieName, String seatNumber, double price) {
        dbConnection.connect();
        Ticket ticket = ticketFactory.createTicket(movieName, seatNumber, price);
        System.out.println("Ticket booked successfully.");
        return ticket;
    }
}
