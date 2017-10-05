package javaspoj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hoangtd
 *         24/10/2016
 */
public class BCFACT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "";
        ArrayList<String> arr = new ArrayList<>();
        while (!s.equals("0")) {
            s = input.nextLine();
            if (!s.equals("0")) {
                arr.add(s);
            }
        }
        for(String k: arr){
            giaithua(k);
        }
    }

    public static void giaithua(String s) {
        int n = Integer.parseInt(s);
        long giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        System.out.println(giaithua);
    }
}
