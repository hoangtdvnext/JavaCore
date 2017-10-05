package javapatterns.Creational.Singleton;

/**
 * Created by hoangtd on 2/21/2017.
 */
public class SingletonObject {
    private static SingletonObject singletonObject;

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        if (singletonObject == null) singletonObject = new SingletonObject();

        return singletonObject;
    }

    public void showMessage() {
        System.out.println("Hello");
    }
}
