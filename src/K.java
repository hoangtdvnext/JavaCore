import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/8/2017.
 */
public class K {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            String stt = input.next();
            String test = input.next();

            int size = test.length()-2;
            while (test.charAt(size)>test.charAt(size+1)){
                size--;
            }

            if(size==-1){
                System.out.println(stt + " " + "BIGGEST");
            }else{
                char min = '9';
                int imin = size;
                for(int k = size+1;k<test.length()-1;k++){
                    if(test.charAt(k)>test.charAt(i) && test.charAt(k) <=min){
                        min = test.charAt(k);
                        imin = k;
                    }
                }
                char temp = test.charAt(i);
//                test.substring(size) = test.substring(min);
            }

        }
    }

    public static  void sinhHV(){

    }
}
