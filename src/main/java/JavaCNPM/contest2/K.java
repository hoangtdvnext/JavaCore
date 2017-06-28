package JavaCNPM.contest2;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/17/2017.
 */
public class K {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int a[] = new int[n + 2];
        for (int i = 1; i <= n; i++) a[i] = i;

        for (int i = 0; i < t; i++) {
            int j = input.nextInt();
            int k = input.nextInt();
            a = gt(a, j, k, n);
        }

        for (int i = 1; i <= n; i++)
            if (i == n) System.out.print(a[i]);
            else System.out.print(a[i] + " ");

    }

    public static int[] gt(int a[], int j, int k, int n) {
        for (int i = 1; i <= n; i++) {
            if (a[i] == j) {
                for (int t = i; t <= n; t++) {
                    a[t] = a[t + 1];
                }
                break;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (a[i] == k) {
                for (int t = n + 1; t >= i + 1; t--) {
                    a[t] = a[t - 1];
                }
                a[i] = j;
                break;
            }
        }

        return a;
    }
}
