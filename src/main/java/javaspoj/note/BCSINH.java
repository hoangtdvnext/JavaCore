package javaspoj.note;

import java.util.Scanner;

/**
 * @author hoangtd
 *         27/10/2016
 */
public class BCSINH {

    static int a[];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=0;
        }
        sinhNP(0);
    }

    public static void in(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void sinhNP(int i){
        for(int k = 0;k<=1;k++){
            a[i] = k;
            if(i==a.length-1) in(a);
            else sinhNP(i+1);//quay lui
        }
    }
}
