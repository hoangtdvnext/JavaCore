package JavaCNPM.contest3;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/29/2017.
 */
public class D {

    static int result = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, a[], b[][];
        n = input.nextInt();
        k = input.nextInt();
        a = new int[n + 1];
        b = new int[501][501];
        for (int i = 1; i <= n; i++) {
            a[i] = input.nextInt();
        }

        a = rutGon(a, n, k);

        int khoang = timKhoang(a, n, k);

        taoBang(a, b, n, k, khoang);

        truyVet(b, n, k, khoang);
    }

    public static int[] xoaPhanTu(int a[], int n, int vt) {
        for (int i = vt; i < n; i++) {
            a[i] = a[i + 1];
        }

        return a;
    }

    public static int[] rutGon(int a[], int n, int k) {
        for (int i = 1; i <= n; ) {
            if (a[i] % k == 0) {
                a = xoaPhanTu(a, n, i);
                result++;
            } else {
                a[i] = a[i] % k;
                i++;
            }
        }

        return a;
    }

    public static int[] taoBang(int a[], int b[][], int n, int k, int khoang) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= khoang; j++) {
                if (i == 0 || j == 0) {
                    b[i][j] = 0;
                    continue;
                }
                if (j < a[i]) {
                    b[i][j] = b[i - 1][j];
                    continue;
                }
                int x = j - a[i];
                if (x == 0) {
                    b[i][j] = (b[i - 1][j] > 0) ? b[i - 1][j] : 1;
                } else {
                    b[i][j] = (b[i - 1][x] > 0) ? b[i - 1][x] + 1 : 0;

                    b[i][j] = (b[i][j] > b[i - 1][j]) ? b[i][j] : b[i - 1][j];
                }
            }
        }

        return a;
    }

    public static void truyVet(int b[][], int n, int k, int khoang) {
        int max = 0;
        for (int i = khoang / k; i >= 0; i--) {
            if (max < b[n][k * i])
                max = b[n][k * i];
        }

        System.out.println(max + result);
    }

    public static int timKhoang(int a[], int n, int k) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += a[i];
        }

        return tong;
    }
}
