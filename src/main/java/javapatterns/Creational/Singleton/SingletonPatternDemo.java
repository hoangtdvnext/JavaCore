package javapatterns.Creational.Singleton;

/**
 * Created by hoangtd on 2/21/2017.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();

        singletonObject.showMessage();
    }
}
