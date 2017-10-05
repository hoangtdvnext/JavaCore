package javapatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 5/8/2017.
 */
public class Product implements Subject {
    List<Observer> obs = new ArrayList<>();
    private String nameProduct;

    public Product(String nameProduct) {
        super();
        this.nameProduct = nameProduct;
    }

    @Override
    public void attachObserver(Observer observer) {
        obs.add(observer);
    }

    public void attachListObserver(List<Observer> observers) {
        obs.addAll(observers);
    }

    @Override
    public void detachObserver(Observer observer) {
            obs.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob : obs) {
            ob.update(nameProduct);
        }
    }
}
