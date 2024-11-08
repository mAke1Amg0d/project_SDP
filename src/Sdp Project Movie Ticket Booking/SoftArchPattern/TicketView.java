package SoftArchPattern;
//MVC Pattern

public class TicketView {
    public void displayTicketDetails(String movieName, String seatNumber, double price) {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}
