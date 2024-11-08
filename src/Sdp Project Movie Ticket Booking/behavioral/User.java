package behavioral;
//Observer Pattern

public class User implements Notifier {
    private String name;

    public User(String name) {
        this.name = name;
    }

    
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
