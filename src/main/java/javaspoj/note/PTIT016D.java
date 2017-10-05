package javaspoj.note;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hoangtd
 *         18/10/2016
 */
public class PTIT016D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        long[] a = new long[n];
        long[] b = new long[n-1];
        a[0]=input.nextInt();
        for (int i = 1; i < n; i++) {
            a[i] = input.nextInt();
            b[i-1] = a[i];
        }
        Arrays.sort(b);
        System.out.println(tinh(b, n, k,a[0]));
    }

    public static long tinh(long[] a, int n, int k,long kq) {
        k=n-k-1;
        for(int i=0;i<k;i++){
            kq-=a[i];
        }
        for(int j=k;j<n-1;j++){
            kq+=a[j];
        }
        return kq;
    }
}
