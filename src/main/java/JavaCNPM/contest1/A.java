package JavaCNPM.contest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            int a[] = new int[m];
            for(int j = 0 ; j < m; j++){
                a[j] = input.nextInt();
            }
            if(checkDoiXung(a,m)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    public static boolean checkDoiXung(int a[], int n) {
        boolean co = true;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) co = false;
        }
        return co;
    }
}
