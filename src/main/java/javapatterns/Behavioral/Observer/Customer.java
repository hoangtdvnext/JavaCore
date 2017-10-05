package javapatterns.Behavioral.Observer;

/**
 * Created by ASUS on 5/8/2017.
 */
public class Customer implements Observer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + ": " + message);
    }
}
