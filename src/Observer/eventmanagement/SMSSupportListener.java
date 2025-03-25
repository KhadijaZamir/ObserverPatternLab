package observer.eventmanagement;

import java.io.File;

public class SMSSupportListener implements CustomEventListener {

    @Override
    public void update(String eventType, File file) {
        // No need to read from a file, just simulate an SMS check
        System.out.println("⚠ Warning: update() should not be used directly. Use simulateSMS() instead.");
    }

    public void simulateSMS(String smsContent) {
        if (smsContent.length() > 160) {
            System.out.println("⚠ Warning: SMS length exceeds 160 characters. Please define a valid SMS.");
        } else {
            System.out.println("📩 Sending SMS: " + smsContent);
        }
    }
}
