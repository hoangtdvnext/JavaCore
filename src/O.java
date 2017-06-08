import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/7/2017.
 */
public class O {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        //1. input data
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        //2.sort
        Arrays.sort(arr);
        //3. giai thuat
        int tong = 0;
        int MOD = (int) Math.pow(10, 9) + 7;
        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            arr[i + 1] = sum % MOD;
            arr[i] = 0;
            tong += sum;
            Arrays.sort(arr);
        }

        System.out.println(tong % MOD);
    }
}

//7
//2 4 1 2 10 2 3 -> 1 2 2 2 3 4 10
//2 2 3 3 4 10-> 3
//3 3 4 4 10->4
//4 4 6 10->6
//6 8 10->8
//10 14->14
//24

