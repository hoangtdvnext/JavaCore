package JavaCNPM.contest2;

import java.util.Scanner;

/**
 * Created by ASUS on 6/13/2017.
 */
public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, n, m;
        a = input.nextInt();
        b = input.nextInt();
        m = input.nextInt();
        n = input.nextInt();

        long sub = 0;
        long pow1 = (long) Math.pow(a, n);
        long pow2 = (long) Math.pow(b, m);

        sub = pow1 - pow2;

        System.out.println(sub);
    }
}
