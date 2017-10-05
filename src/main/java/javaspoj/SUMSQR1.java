package javaspoj;

import java.util.Scanner;

/**
 * Created by Administrator on 25/10/2016.
 */
public class SUMSQR1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String s = "0";
        for (int i = 1; i <= n; i++) {
            s = Sum(s,mul(i + "",i + ""));
        }
        System.out.println(s);
    }

    public static String Sum(String a, String b) {
        int lenght = a.length();
        int carry = 0;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            int tmp = Integer.parseInt(a.charAt(i) + "") + Integer.parseInt(b.charAt(i) + "");
            carry = tmp / 10;
            tmp = tmp % 10;
            result = tmp + result;
        }
        return result;
    }

    public static String mul(String a,String b){
        String result="";
        int n=a.length();
        int m=b.length();
        int lenght=n+m-1;
        int carry=0;
        for (int i = lenght; i >=0; i--) {
            int tmp=0;
            for (int j = n-1; j >=0; j--) {
                if(i-j<=m && i-j>=1){
                    int a1=Integer.parseInt(a.charAt(j)+"");
                    int b1=Integer.parseInt(b.charAt(i-j-1)+"");
                    tmp+=a1*b1;
                }
                tmp+=carry;
                carry=tmp/10;
                result=tmp%10+result;
            }
        }
        while(result.length()>1 && result.charAt(0)=='0'){
            result=result.substring(1);
        }
        return result;
    }

}
