package observer.eventmanagement;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        // Step 1: Create an EventManager with an SMS event type
        EventManager eventManager = new EventManager("smsEvent");

        // Step 2: Create and subscribe an SMSSupportListener
        SMSSupportListener smsListener = new SMSSupportListener();
        eventManager.subscribe("smsEvent", smsListener);

        // Step 3: Notify event with SMS messages (simulated)
        System.out.println("🔹 Sending valid SMS:");
        smsListener.simulateSMS("Hello! This is a short message.");

        System.out.println("\n🔹 Sending long SMS:");
        smsListener.simulateSMS("This is a very long SMS that exceeds 160 characters. "
                + "It should trigger a warning because messages should be within the allowed limit. "
                + "If it's too long, the system should notify the user to shorten it.");

        // ==============================
        // Editor-Related Event Handling
        // ==============================

        // Step 4: Create an Editor instance
        Editor editor = new Editor();

        // Step 5: Subscribe event listeners for file operations
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        // Step 6: Perform file operations
        try {
            editor.openFile("test.txt");  // Simulates opening a file
            editor.saveFile();            // Simulates saving a file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
