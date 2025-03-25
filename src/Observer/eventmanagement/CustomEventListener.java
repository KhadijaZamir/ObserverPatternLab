
package observer.eventmanagement;

import java.io.File;


public interface CustomEventListener {
    void update(String eventType, File file);
}
