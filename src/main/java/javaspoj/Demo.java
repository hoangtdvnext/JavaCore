package javaspoj;

import java.util.Scanner;

/**
 * Created by Administrator on 25/10/2016.
 */
public class Demo {
    public static void main (String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        String str[] = input.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        String so = " " + input.nextLine();
        int vt = 0;
        if(k==0) System.out.println(so.trim());
        else{
            k = n - k;
            for (int i = 1; i <= k; i++) {
                char max = 0;
                for (int j = vt + 1; j <= n - k + i; j++) {
                    if (so.charAt(j) > max) {
                        max = so.charAt(j);
                        vt = j;
                        if (max == '9') break;
                    }
                }
                System.out.print(max);
            }
        }
    }
}
