package javaCore.abstract_dev;

/**
 * Created by ASUS on 5/31/2017.
 *
 * Lớp abstract (0 tới 100%)
 * Interface (100%)
 */
public abstract class JavaAbstract {
    // k bắt buộc phải cài đè ở lớp con
    void run(){
        System.out.println("demo java abstract");
    }
    // bắt buộc overidde ở lớp cha
    abstract void show();

}
