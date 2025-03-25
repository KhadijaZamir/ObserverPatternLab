package observer.eventmanagement;  // ✅ Fixed package name

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<CustomEventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, CustomEventListener listener) {
        List<CustomEventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, CustomEventListener listener) {
        List<CustomEventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<CustomEventListener> users = listeners.get(eventType);
        for (CustomEventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
