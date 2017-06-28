package JavaCNPM.contest1;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/8/2017.
 */
public class K {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String test[] = input.nextLine().split(" ");
            int stt = Integer.parseInt(test[0]);
            String inputTest = test[1];
            sinhHV(inputTest, inputTest.length(), stt);
        }

    }

    public static void sinhHV(String input, int n, int stt) {
        char arr[] = input.toCharArray();
        int i = n - 2;
        while (arr[i] >= arr[i + 1]) {
            i--;
            if (i == -1) break;
        }

        if (i == -1) {
            System.out.println(stt + " BIGGEST");
        } else {
            char min = '9';
            int imin = i;
            for (int k = i + 1; k < n; k++) {
                if (arr[k] > arr[i] && arr[k] <= min) {
                    min = arr[k];
                    imin = k;
                }
            }

            char tmp = arr[i];
            arr[i] = arr[imin];
            arr[imin] = tmp;

            for (int k = i + 1; k < n - 1; k++) {
                for (int j = k + 1; j < n; j++) {
                    if (arr[k] > arr[j]) {
                        tmp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }

            String ans = "";
            for (int j = 0; j < n; j++) {
                ans += arr[j];
            }
            System.out.println(stt + " " + ans);
        }
    }
    //3
    // 1 123
    // 2 279134399742
    // 3 987
}
