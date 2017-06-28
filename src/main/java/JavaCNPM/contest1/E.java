package JavaCNPM.contest1;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < n; i++) {
            if (checkTN(arr[i]) && checkSoChan(arr[i])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static boolean checkTN(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String tmp = stringBuilder.reverse().toString();
        if (tmp.equals(str))
            return true;

        return false;
    }

    public static boolean checkSoChan(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Integer.parseInt(str.charAt(i) + "") % 2 != 0)
                return false;
        }
        return true;
    }
}
