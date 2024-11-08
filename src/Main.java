import javax.swing.*;
import SoftArchPattern.Ticket;
import SoftArchPattern.TicketView;
import SoftArchPattern.TicketController;
import structural.BookingFacade;
import structural.PaymentAdapter;
import behavioral.NotificationService;
import behavioral.User;

//The Main class shows how all the system's parts work together
// Main employs many design patterns (Facade, Adapter, Observer).
public class Main {
    public static void main(String[] args) {
        // Create the main frame for the application
        JFrame frame = new JFrame("Movie Ticket Booking System");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels and text fields for movie details
        JLabel movieLabel = new JLabel("Movie Name:");
        movieLabel.setBounds(20, 20, 100, 25);
        JTextField movieField = new JTextField();
        movieField.setBounds(150, 20, 200, 25);

        JLabel seatLabel = new JLabel("Seat Number:");
        seatLabel.setBounds(20, 60, 100, 25);
        JTextField seatField = new JTextField();
        seatField.setBounds(150, 60, 200, 25);

        JLabel priceLabel = new JLabel("Ticket Price:");
        priceLabel.setBounds(20, 100, 100, 25);
        JTextField priceField = new JTextField();
        priceField.setBounds(150, 100, 200, 25);

        JLabel cardLabel = new JLabel("Card Number:");
        cardLabel.setBounds(20, 140, 100, 25);
        JTextField cardField = new JTextField();
        cardField.setBounds(150, 140, 200, 25);

        JButton bookButton = new JButton("Book Ticket");
        bookButton.setBounds(150, 180, 120, 30);

        // Text area to display booking information
        JTextArea bookingInfoArea = new JTextArea();
        bookingInfoArea.setBounds(20, 230, 440, 200);
        bookingInfoArea.setEditable(false);
        bookingInfoArea.setLineWrap(true);
        bookingInfoArea.setWrapStyleWord(true);

        // Add action listener for the book button
        bookButton.addActionListener(e -> {
            String movieName = movieField.getText();
            String seatNumber = seatField.getText();
            double price;
            try {
                price = Double.parseDouble(priceField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid price input.");
                return;
            }

            // MVC Setup
            Ticket ticket = new Ticket(movieName, seatNumber, price);
            TicketView view = new TicketView();
            TicketController controller = new TicketController(ticket, view);
            controller.updateView();

            // Booking process with Facade
            BookingFacade bookingFacade = new BookingFacade();
            Ticket bookedTicket = bookingFacade.bookTicket(movieName, seatNumber, price);

            // Payment with Adapter
            PaymentAdapter paymentAdapter = new PaymentAdapter();
            String cardNumber = cardField.getText();
            paymentAdapter.makePayment(cardNumber, price);

            // Notification service
            NotificationService notificationService = new NotificationService();
            User user = new User("User");
            notificationService.subscribe(user);
            notificationService.notifyUsers("Your ticket for " + movieName + " at seat " + seatNumber + " is confirmed!");

            // Update the booking information display
            String bookingInfo = "Booking Information:\n" +
                                 "---------------------------\n" +
                                 "Movie Name: " + movieName + "\n" +
                                 "Seat Number: " + seatNumber + "\n" +
                                 "Ticket Price: $" + price + "\n" +
                                 "Payment Status: Processed successfully\n" +
                                 "Notification: Your ticket for " + movieName + " at seat " + seatNumber + " is confirmed!";
            bookingInfoArea.setText(bookingInfo);

            JOptionPane.showMessageDialog(frame, "Booking and payment completed successfully!");
        });

        //components of the frame
        frame.add(movieLabel);
        frame.add(movieField);
        frame.add(seatLabel);
        frame.add(seatField);
        frame.add(priceLabel);
        frame.add(priceField);
        frame.add(cardLabel);
        frame.add(cardField);
        frame.add(bookButton);
        frame.add(bookingInfoArea);

        // Set the frame visible
        frame.setVisible(true);
    }
}