package javaspoj;

import java.util.Scanner;

/**
 * Created by hoangtd on 3/14/2017.
 */
public class P131SUMJ {

    static int arrI[], brrI[];

    public static void main(String[] args) {
        String str[] = new Scanner(System.in).nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int price = Integer.parseInt(str[1]);
        arrI = new int[n];
        brrI = new int[n];
        for (int i = 0; i < n; i++) {
            arrI[i] = Integer.parseInt(new Scanner(System.in).nextLine());
            brrI[i] = arrI[i];
        }
        System.out.println(sumPrice(price));
    }

    public static int sumPrice(int price) {
        int sum1 = 0;
        for (int i = 0; i < arrI.length - 1; i++) {
            int tmp = 0;
            double sumTmp = 0;
            int tmpAfter = brrI[i];
            while (true) {
                arrI[i]++;
                if (i > 0 && i < arrI.length - 1) {
                    tmp = (Math.abs(brrI[i] - brrI[i - 1]) + Math.abs(brrI[i] - brrI[i + 1])) * price;
                } else {
                    tmp = (Math.abs(brrI[i + 1] - brrI[i])) * price;
                }
                sumTmp = Math.pow(arrI[i] - tmpAfter, 2);
                if (sumTmp > tmp) {
                    arrI[i]--;
                    break;
                }
            }
            sum1 += Math.pow(arrI[i] - tmpAfter, 2);
        }

        int sum2 = 0;
        for (int i = 0; i < arrI.length - 1; i++) {
            sum2 += Math.abs(arrI[i + 1] - arrI[i]) * price;
        }

        return sum1 + sum2;
    }
}
