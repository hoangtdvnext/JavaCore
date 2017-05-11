package patterns.Behavioral.Observer;

/**
 * Created by ASUS on 5/8/2017.
 */
public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Ti", 11);
        Customer cus2 = new Customer("Teo", 12);
        Product product1 = new Product("Laptop");
        product1.attachObserver(cus1);// cus1 dang ky phan ung khi có thông báo
        // từ product
        product1.attachObserver(cus2);
        product1.notifyObserver();// thông báo đến tất cả các Observer.
        product1.detachObserver(cus1);
        product1.detachObserver(cus2);
        product1.notifyObserver();// thông báo đến tất cả các Observer.
    }
}
