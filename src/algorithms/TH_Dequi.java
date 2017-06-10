package algorithms;

import java.util.Scanner;

/**
 * Created by ASUS on 6/10/2017.
 */
public class TH_Dequi {
    /*khai bao bien*/
    static int ok = 1;
    static int n, k, a[] = new int[100];

    public static void nhap() {
        n = new Scanner(System.in).nextInt();
        k = new Scanner(System.in).nextInt();
    }

    public static void next(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k)
                xuat();
            else
                next(i + 1);
        }
    }

    public static void xuat() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ok = 1;
        nhap();
        next(1);
    }

}
