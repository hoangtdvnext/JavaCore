package JavaCNPM.contest1;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/11/2017.
 */
public class I {
    static int N, K, S;
    static int[] visit, X;
    static String[] A;

    static void sinhhoanvi(int i) {
        for (int j = 0; j <= 1; j++) {
            X[i] = j;
            if (i == N - 1) {
                tinh();
            } else {
                sinhhoanvi(i + 1);
            }
        }
    }

    static void tinh() {
        int dem = 0, i = 0, ok = 0;
        while (i < N) {
            if (X[i] == 0)
                dem++;
            else {
                if (dem == K) {
                    ok = 1;
                    break;
                }
                dem = 0;
            }
            i++;
        }
        if (i == N && dem == K)
            ok = 1;

        if (ok == 1) {
            for (int i1 = 0; i1 < N; i1++) {
                if (X[i1] == 0) {
                    if (A[S] == null) {
                        A[S] = "A";
                    } else
                        A[S] += "A";
                } else {
                    if (A[S] == null) {
                        A[S] = "B";
                    } else
                        A[S] += "B";
                }

            }
            S++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        S = 0;
        visit = new int[N];
        X = new int[N];
        A = new String[40000];

        sinhhoanvi(0);

        System.out.println(S);
        for (int i = 0; i < S; i++) {
            System.out.println(A[i]);
        }
    }
}
