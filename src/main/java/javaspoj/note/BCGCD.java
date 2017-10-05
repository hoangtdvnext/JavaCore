package javaspoj.note;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hoangtd
 *         18/10/2016
 */
public class BCGCD {
    public static void main(String[] args) {
        long a, b;
        String inputString = "";
        ArrayList<String> arrInput = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (!inputString.equals("0 0")) {
            inputString = reader.nextLine();
            arrInput.add(inputString);
        }
        for (String str : arrInput) {
            String arrSplit[] = str.split(" ");
            a = Long.parseLong(arrSplit[0]);
            b = Long.parseLong(arrSplit[1]);
            if (a != 0 && b != 0) {
                System.out.println(uc(a, b) + " " + bcnn(uc(a, b), a, b));
            }
        }
    }

    public static long uc(long x, long y) {
        long r;
        while (x % y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        return y;
    }

    public static long bcnn(long uc, long a, long b) {
        return (a * b) / uc;
    }
}
