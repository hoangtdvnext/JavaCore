package javaCore;

/**
 * Created by ASUS on 5/30/2017.
 */
public class JavaStatic {
    static int a = 100;
    static int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(JavaStatic.sum(1,2));
    }
}
