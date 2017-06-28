package JavaCNPM.algorithms;

import java.util.Scanner;

/**
 * Created by ASUS on 6/9/2017.
 * BCPERMU
 */
public class HoanVi {

    static boolean ok = true;

    // Duyet mang tu 1 -> n
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[9];
        for (int i = 1; i <= n; i++) {
            a[i] = i;
        }

        show(a, n);
        while (ok) {
            sinhHV(a, n);
        }
    }

    // input n
    // start = 1234
    // end  = 4321
    public static void sinhHV(int a[], int n) {
        int i = n - 1;
        //1. Tim vi tri i ma phan tu thu a[i] < a[i+1]
        while (i > 0 && a[i] > a[i + 1]) i--;
        //2. Neu chua duyet het thi van con co the sinh tiep
        if (i > 0) {
            int k = n;
            //3. Duyet tu cuoi toi vi tri i xem thang a[k] > a[i] -> k
            while (a[i] > a[k]) k--;
            //4. Doi cho a[i] -> a[k]
            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
            //5. Dao vi tri day tu vi tri thu i+1 toi vi tri thu n
            int start = i + 1, end = n;
            while (start <= end) {
                tmp = a[start];
                a[start] = a[end];
                a[end] = tmp;
                // chay tiep bang cach tang dau va giam cuoi cho het cac phan tu
                start++;
                end--;
            }
            //6. show
            show(a, n);
        } else {
            ok = false;
        }
    }

    // 6. In ra man hinh
    public static void show(int a[], int n) {
        String ans = "";
        for (int i = 1; i <= n; i++) {
            ans += a[i];
        }
        System.out.println(ans);
    }
}
