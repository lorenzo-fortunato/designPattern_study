package observer;

import java.io.File;

public interface IEventListener {
    void update(String eventType, File file);
}
