package JavaCNPM.contest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str[] = input.nextLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int p = Integer.parseInt(str[2]);

            int a[] = new int[N];
            for (int j = 0; j < N; j++) {
                a[j] = input.nextInt();
            }
            int b[] = new int[M];
            for (int j = 0; j < M; j++) {
                b[j] = input.nextInt();
            }

            int c[] = chenMang(a, b, p);

            String output = "Test " + (i + 1) + ":\n";
            for (int j = 0; j < c.length; j++) {
                output += c[j] + " ";
            }

            answer.add(output);
            // read line next
            input.nextLine();
        }

        answer.forEach(ans -> System.out.println(ans));
    }

    public static int[] chenMang(int a[], int b[], int vt) {
        int output[] = new int[a.length + b.length];
        int tmp = vt;

        for (int i = 0; i < vt; i++) {
            output[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            output[vt++] = b[i];
        }

        for (int i = tmp; i < a.length; i++) {
            output[vt++] = a[i];
        }

        return output;
    }
}
