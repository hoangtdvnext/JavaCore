import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String dathuc1 = input.nextLine();
            String dathuc2 = input.nextLine();

            System.out.println(sumDaThuc(dathuc1, dathuc2));
        }
    }

    public static String sumDaThuc(String dathuc1, String dathuc2) {
        String str1[] = dathuc1.split("[\\s,+]+");
        String str2[] = dathuc2.split("[\\s,+]+");
        String output = "";
        long a[] = new long[10000];
        int ba = 0, bb = 0;
        for (int i = 0; i < str1.length; i++) {
            String arr[] = str1[i].split("\\*x\\^");
            if (ba <= Integer.parseInt(arr[1]))
                ba = Integer.parseInt(arr[1]);
            a[Integer.parseInt(arr[1])] = Integer.parseInt(arr[0]);
        }

        long b[] = new long[10000];
        for (int i = 0; i < str2.length; i++) {
            String arr[] = str2[i].split("\\*x\\^");
            if (bb <= Integer.parseInt(arr[1]))
                bb = Integer.parseInt(arr[1]);
            b[Integer.parseInt(arr[1])] = Integer.parseInt(arr[0]);
        }

        int max = 0;
        if(ba>bb) max = ba;
        else max = bb;

        long c[] = new long[10000];
        for(int i= max;i>=0;i--){
            c[i] = a[i] + b[i];
            if(c[i]!=0){
                output += c[i] + "*x^" + i + " + ";
            }
        }

        return output.substring(0, output.length()-3);
    }
}
