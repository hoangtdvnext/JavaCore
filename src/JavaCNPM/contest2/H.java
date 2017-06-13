package JavaCNPM.contest2;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/13/2017.
 */
public class H {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = Integer.parseInt(input.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(input.nextLine());
            int c[];
            String a[], b[];
            c = new int[n];
            a = new String[n];
            b = new String[n];
            for (int j = 0; j < n; j++) {
                String str[] = input.nextLine().split(" ");
                a[j] = str[0];
                b[j] = str[1];
                c[j] = Integer.parseInt(str[2]);

            }

        }
    }

    public static void resultData(String a[], String b[], int c[], int n, int num) {
        System.out.println("DATASET " + num);
        int MAX = 100;
        String TED = "TED";
        for (int i = 0; i < n; i++) {
            if (a[i].equals(TED)) {
                int age = MAX - c[i];
                System.out.println(b[i] + " " + age);
                for (int j = 0; j < n; j++) {
                    if (b[i].equals(a[i]) && j != i) {
                        age = c[i] - c[j];
                        System.out.println(b[j] + age);
                    }
                }
            }
        }

    }
}
