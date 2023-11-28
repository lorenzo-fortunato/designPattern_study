package notifier;

import observer.IEventListener;

import java.io.File;
import java.util.*;

public class EventManager {
    Map<String, List<IEventListener>> observerList = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.observerList.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, IEventListener observer) {
        List<IEventListener> users = observerList.get(eventType);
        users.add(observer);
    }

    public void unSubscribe(String eventType, IEventListener observer) {
        List<IEventListener> users = observerList.get(eventType);
        users.remove(observer);
    }

    public void notify(String eventType, File file) {
        List<IEventListener> users = observerList.get(eventType);
        for (IEventListener observer : users) {
            observer.update(eventType, file);
        }
    }
}
