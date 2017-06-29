package JavaCNPM.algorithms;

import java.util.Scanner;

/**
 * Created by ASUS on 5/5/2017.
 */

// De qui
public class Fibonacci {
    /*
    * Dieu kien co ban: Khi gap dieu kien nay thi viec goi chinh ham de qui se dung lai
    * Tiem can: Moi khi ham de qui duoc goi thi no cang tiem can toi dieu kien
    * */
    static int f1 = 0;
    static int f2 = 1;

    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        // nhap dau vao do dai cua chuoi
        int n = new Scanner(System.in).nextInt();
        // in 2 gia tri mac dinh trong day
        System.out.print(f1 + " " + f2 + " ");
        // in tu thang thu 2 tro di
        fibonacci(n - 2);
    }

    public static void fibonacci(int n) {
        // check dieu kien
        if (n > 0) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + " ");
            fibonacci(n - 1);
        }
    }

    // fibonacci de qui

    public static int fibonacciDQ(int n) {
        if (n < 2) return n;

        int f0 = 0, f1 = 1, fn = 0;
        for (int i = 2; i < n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }

        return fn;
    }
}
