package JavaCNPM.algorithms;

import java.util.Scanner;

/**
 * Created by ASUS on 6/6/2017.
 */
public class DeQui {

    static int n,arr[][],permute[];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        arr = new int [n+1][2];
        permute = new int[n+1];

    }

    public static void toPermute(int index){
        if(index>n){
            for(int i = 1;i<=n;i++){
                System.out.print(permute[i]);
                if(i<n) System.out.print(",");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            if(arr[i][1]==0){
                permute[index] = arr[i][0];

            }
        }
    }


}
