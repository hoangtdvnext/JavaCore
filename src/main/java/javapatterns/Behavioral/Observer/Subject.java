package javapatterns.Behavioral.Observer;

/**
 * Created by ASUS on 5/8/2017.
 */
public interface Subject {

    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    void notifyObserver();
}
