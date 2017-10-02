package JavaCNPM.contest1;

import java.util.Scanner;

/**
 * Created by ASUS on 6/6/2017.
 */
public class H {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n, a[] = new int[10];
            String S[] = new String[10];
            n = in.nextInt();
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                S[i] = in.next();
                a[i] = i;
                result.append(S[i]);
            }
            while (true) {
                a = sinhHV(a, n);
                // check neu a == null -> break
                // kiem tra ket qua
                if (a == null) break;

                StringBuilder tmp = new StringBuilder();
                for (int j = 1; j <= n; j++) {
                    tmp.append(S[a[j]]);
                }
                // neu ket qua sau nho hon thi gan lai result
                if (result.toString().compareTo(tmp.toString()) > 0) {
                    result.replace(0,tmp.toString().length(), tmp.toString());
                }
            }

            System.out.println(result);
        }
    }

    public static int[] sinhHV(int a[], int n) {
        //1.Duyet tim vi tri ma a[i] > a[i+1]
        int i = n - 1;
        while (i > 0 && a[i] > a[i + 1]) i--;
        // kiem tra neu duyet het ko thay thi dung lai
        if (i > 0) {
            // tim vi tri k tu phai qua trai, vi tri nao thoa man a[k] > a[i] thi doi cho
            int k = n;
            while (a[i] > a[k]) k--;
            // doi cho a[i] vs a[k]
            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
            //tu vi tri i+1 toi n sap xep tu nho toi lon or doi cho(dp day da dk sap xep)
            int start = i + 1, end = n;
            while (start <= end) {
                tmp = a[start];
                a[start] = a[end];
                a[end] = tmp;
                start++;
                end--;
            }

            return a;
        } else {
            return null;
        }
    }
}
