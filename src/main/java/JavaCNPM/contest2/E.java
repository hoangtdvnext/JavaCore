package JavaCNPM.contest2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ASUS on 6/13/2017.
 */
public class E {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger powA, powB;
        int a, b, m, n;
        a = input.nextInt();
        b = input.nextInt();
        n = input.nextInt();
        m = input.nextInt();

        powA = new BigInteger(String.valueOf(a)).pow(n);
        powB = new BigInteger(String.valueOf(b)).pow(m);

        BigInteger add = powA.subtract(powB);
        System.out.println(add);
    }
}
