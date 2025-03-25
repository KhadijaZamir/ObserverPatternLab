package sdalab2;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // Creating observers
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        // Attaching observers to the subject
        subject.attach(hexaObserver);
        subject.attach(octalObserver);
        subject.attach(binaryObserver);

        System.out.println("First state change: 15");    
        subject.setState(15); // All observers will be notified

        System.out.println("\nDetaching OctalObserver...");
        subject.detach(octalObserver); // Removing one observer

        System.out.println("\nSecond state change: 10");
        subject.setState(10); // Only HexaObserver & BinaryObserver will be notified
    }
}
