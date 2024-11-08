package behavioral;
//Observer Pattern

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Notifier> notifiers = new ArrayList<>();

    public void subscribe(Notifier notifier) {
        notifiers.add(notifier);
    }

    public void unsubscribe(Notifier notifier) {
        notifiers.remove(notifier);
    }

    public void notifyUsers(String message) {
        for (Notifier notifier : notifiers) {
            notifier.update(message);
        }
    }
}
