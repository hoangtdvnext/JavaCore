package javaspoj;

import java.util.Scanner;

/**
 * Created by ASUS on 7/3/2017.
 * http://www.spoj.com/problems/PRIME1/
 */
public class PRIME1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, t;
        t = input.nextInt();
        for (int k = 0; k < t; k++) {
            m = input.nextInt();
            n = input.nextInt();
            for (int i = m; i <= n; i++) {
                if (peter(i)) System.out.println(i);
            }
            System.out.println();
        }
    }

    public static boolean peter(int a) {
        if (a < 2) return false;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }

        return true;
    }
}
