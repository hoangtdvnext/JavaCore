import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class C {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            int u[] = new int[n];
            u[i] = input.nextInt();
            int d[] = new int[n];
            d[i] = input.nextInt();
            input.nextLine();
        }
    }

    public static void minTime(int u[],int d[], int n){
        int min = 0;
        for (int i = 0; i < n; i++) {

        }
    }
}
