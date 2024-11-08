package SoftArchPattern;
//MVC Pattern

public class Ticket {
    private String movieName;
    private String seatNumber;
    private double price;

    public Ticket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }
}
