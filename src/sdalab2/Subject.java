package sdalab2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    // Method to attach an observer
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Method to detach an observer
    public void detach(Observer observer) {
        observers.remove(observer);  // Removes the observer from the list
    }

    // Notify all active observers
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
