package SoftArchPattern;
//MVC Pattern

public class TicketController {
    private Ticket model;
    private TicketView view;

    public TicketController(Ticket model, TicketView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayTicketDetails(model.getMovieName(), model.getSeatNumber(), model.getPrice());
    }
}

