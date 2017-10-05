package javaspoj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 26/10/2016.
 */
public class SUMDIV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Long> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(Long.parseLong(input.nextLine()));
        }
        arr.forEach(s->{
            gt(s);
        });
    }
    public static void gt(long a){
        long tong = 0;
        for (long i=1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                tong +=i + a/i;
            }
        }
        System.out.println(tong);
    }
}
