import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/8/2017.
 */
public class K {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int a[];
        for (int i = 0; i < n; i++) {
            String test[] = input.nextLine().split(" ");
            int stt = Integer.parseInt(test[0]);
            String inputTest = test[1];
            a = parseInputTestToArr(inputTest);
            sinhHV(a, inputTest.length(), stt);
        }

    }

    public static int[] parseInputTestToArr(String input) {
        int a[] = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            a[i] = Integer.parseInt(input.charAt(i) + "");
        }

        return a;
    }

    public static void sinhHV(int a[], int n, int stt) {
        int i = n - 2;
        while (a[i] >= a[i + 1]) {
            i--;
            if (i == -1) break;
        }

        if (i == -1) {
            System.out.println(stt + " BIGGEST");
        } else {
            int min = 9;
            int imin = i;
            for (int k = i + 1; k < n; k++) {
                if (a[k] > a[i] && a[k] <= min) {
                    min = a[k];
                    imin = k;
                }
            }

            int tmp = a[i];
            a[i] = a[imin];
            a[imin] = tmp;

            for (int k = i + 1; k < n - 1; k++) {
                for (int j = k + 1; j < n; j++) {
                    if (a[k] > a[j]) {
                        tmp = a[k];
                        a[k] = a[j];
                        a[j] = tmp;
                    }
                }
            }

            String ans = "";
            for (int j = 0; j < n; j++) {
                ans += a[j];
            }
            System.out.println(stt + " " + ans);
        }
    }
    //3
    // 1 123
    // 2 279134399742
    // 3 987
}
