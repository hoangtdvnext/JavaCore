package pattern.SingletonPattern;

/**
 * Created by hoangtd on 2/21/2017.
 */
public class SingletonObject {
    private static SingletonObject singletonObject = new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        return singletonObject;
    }

    public void showMessage() {
        System.out.println("Hello");
    }
}
