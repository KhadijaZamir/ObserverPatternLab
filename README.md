# Observer Pattern Lab  

This repository contains the implementation of the **Observer Pattern** in Java as part of a lab assignment. The assignment consists of two main parts:

## **Part 1: Basic Observer Pattern Implementation**  
This part is based on the **tutorialspoint.com** example and includes the following modifications:  

- **Added a `detach(Observer o)` method** in the `Subject` class to remove observers.  
- **Modified `ObserverPatternDemo`** so that it changes the observer and then updates the state. Only active observers are notified.  

### **Files in Part 1 (`sdalab2` package)**  
- `Subject.java`: Manages observers and notifies them when the state changes.  
- `Observer.java`: Abstract class for all observers.  
- `HexaObserver.java`, `OctalObserver.java`, `BinaryObserver.java`: Concrete observer implementations.  
- `ObserverPatternDemo.java`: Demonstrates how the observer pattern works.  


## **Part 2: Event Management System**  
This part is based on the **refactoring.guru** example and includes:  

- A **new package `observer.eventmanagement`** that contains event-driven observer pattern code.  
- An **`SMSSupportListener`** that checks if an SMS exceeds 160 characters.  
  - If it does, a warning is shown.  
  - Otherwise, the message is sent successfully.  

### **Files in Part 2 (`observer.eventmanagement` package)**  
- `EventManager.java`: Manages event subscriptions and notifications.  
- `EventListener.java`: Interface for all event listeners.  
- `SMSSupportListener.java`: Checks SMS length before sending.  
- `Demo.java`: Implements and tests the event system.  


