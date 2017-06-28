package JavaCNPM.algorithms;

/**
 * Created by Hoang Ta Duy on 6/17/2017.
 */
public class NhiPhan {

    static int a[], n;

    public static void main(String[] args) {

    }

    public static void show() {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void sinhNhiPhan(int i) {
        for (int j = 0; j <= 1; j++) {
            if (i == n - 1) show();
            else sinhNhiPhan(i + 1);
        }
    }
}
