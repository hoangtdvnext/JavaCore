package javaspoj.note;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hoangtd
 *         18/10/2016
 */
public class PTIT015I {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int i = 0;
        ArrayList<String> listLine1 = new ArrayList<>();
        ArrayList<String> listLine2 = new ArrayList<>();
        while (i < n) {
            listLine1.add(input.nextLine());
            listLine2.add(input.nextLine());
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.println(gt(listLine1.get(j), listLine2.get(j)));
        }
    }

    public static int gt(String s1, String s2) {
        String a[] = s1.split(" ");
        int n = Integer.parseInt(a[0]);
        int t = Integer.parseInt(a[1]);
        String b[] = s2.split(" ");
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong = tong + Integer.parseInt(b[i]);
            if (tong > t) return i;
        }
        return n;
    }
}
