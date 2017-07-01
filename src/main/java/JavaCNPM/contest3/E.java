package JavaCNPM.contest3;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/30/2017.
 */
public class E {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n, m, q, a[][];
            n = input.nextInt();
            m = input.nextInt();
            a = new int[n + 1][m + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    int dau = input.nextInt();
                    int cuoi = input.nextInt();
                    a[i][j] = 1;
                    a[j][i] = 1;
                }
            }
        }
    }

    public static void dfs(int v){

    }
}
