import common.MD5;

import java.util.Scanner;

/**
 * Created by ASUS on 5/23/2017.
 */
public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextLine());
//        int a[] = new int[100];
//        for(int i=0;i<3;i++){
//            a[i] = input.nextInt();
//            System.out.println(a[i]);
//        }
//
//        for(int i=0;i<3;i++){
//            a[i] = input.nextInt();
//            System.out.println(a[i]);
//        }
        String s = input.nextLine();
        System.out.println(s.substring(1,s.length()));

    }
}
