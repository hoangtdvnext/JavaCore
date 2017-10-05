package javaspoj;

import java.util.Scanner;

/**
 * Created by Administrator on 26/10/2016.
 */
public class BCBIGNUM {

        public static String Sum(String a, String b){
            int lenght=a.length();
            int carry=0;
            String result="";
            for (int i = a.length()-1; i >=0 ; i--) {
                int tmp=Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"");
                carry=tmp/10;
                tmp=tmp%10;
                result=tmp+result;
            }
            return result;
        }
        public static String Sub(String a,String b) {
            String result="";
            int borrow=0;
            for(int i=a.length()-1;i>=0;i--){
                int tam=a.charAt(i)-b.charAt(i)-borrow;
                if(tam<0){
                    tam+=10;
                    borrow=1;
                }else{
                    borrow=0;
                }
                result=tam+result;
            }
            while(result.length()>1 && result.charAt(0)=='0'){
                result=result.substring(1);
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
        public static void main(String[] args) {
            String A;
            String B;
            Scanner in=new Scanner(System.in);
            A=in.nextLine();
            B=in.nextLine();
            String mul=mul(A, B);
            if(A.length()>B.length()){
                while(A.length()>B.length()){
                    B='0'+B;
                }
            }else
            if(A.length()<B.length()){
                while(A.length()<B.length()){
                    A='0'+A;
                }
            }
            System.out.println(Sum(A, B));
            if ((int)A.charAt(0)>=(int)B.charAt(0)) {
                System.out.println(Sub(A, B));
            }else{
                System.out.println("-"+Sub(B, A));
            }
            System.out.println(mul);
        }
}
