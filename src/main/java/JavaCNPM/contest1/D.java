package JavaCNPM.contest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(in.nextLine());
            arrInt.add(size);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Test " + (i + 1) + ":");
            xoayOc(arrInt.get(i));
        }
    }

    public static void xoayOc(int n) {
        int a[][] = new int[400][400];
        int gt, d, c, i;
        d = 0;
        c = n - 1;
        gt = n*n-1;
        while (d <= c) {
            // đi từ trái qua phải giữ nguyên hàng
            for (i = d; i <= c; i++) {
                a[d][i] = gt--;
            }
            // đi từ hàng thứ 2 tới hết, giữ nguyên cột
            for (i = d + 1; i <= c; i++) {
                a[i][c] = gt--;
            }
            // đi từ cột - 1 giữ nguyên hàng
            for (i = c - 1; i >= d; i--) {
                a[c][i] = gt--;
            }
            // đi từ hàng -1 giữ nguyên cột
            for (i = c - 1; i > d; i--) {
                a[i][d] = gt--;
            }
            d++;
            c--;
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print((a[j][k] + 1) + " ");
            }
            System.out.println();
        }
    }
}
