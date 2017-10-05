package javaspoj.note;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hoangtd
 *         18/10/2016
 */
public class PTIT121I {

    public static void gt(String s) {
        String str[] = s.split(" ");
        int r = Integer.parseInt(str[1]);
        s = str[2];
        if (r > 8 || r < 1 || s.length() > 20) {
        } else {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < r; j++) {
                    buffer.append(s.charAt(i));
                }
            }
            System.out.println(str[0] + " " + buffer.toString());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        String s;
        while (i < n) {
            s = in.nextLine();
            if (s.length() > 0) {
                list.add(s);
                i++;
            }
        }
        for (int i1 = 0; i1 < list.size(); i1++) {
            gt(list.get(i1));
        }

    }
}
