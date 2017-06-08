import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class HoanVi {
    static int i,n, a[];

    public static void init(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử cần hoán vị:");
            n = input.nextInt();
        } while (n <= 0);

        a = new int[n+1];
        for (int j = 1; j <= n; j++) {
            a[j] = j;
        }
    }
}
