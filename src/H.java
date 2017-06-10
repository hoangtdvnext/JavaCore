import java.util.Scanner;

/**
 * Created by ASUS on 6/6/2017.
 */
public class H {

    static boolean ok = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String str[] = input.nextLine().split(" ");
            int m = Integer.parseInt(str[0]);
            String strTmp[] = new String[m];
            for (int j = 1; j <= m; j++) {
                strTmp[j - 1] = str[j];
            }
            sort(strTmp);
        }
    }


    public static void sort(String strTmp[]) {
        String input = "";
        String result = "";
        for (int i = 0; i < strTmp.length; i++) {
            input += i + 1;
            result +=strTmp[i];
        }

        while (ok == false) {
            char tmp[] = sinhHV(input, strTmp.length);
            input = String.copyValueOf(tmp);
            String str = "";
            for (int i = 0; i < strTmp.length; i++) {
                str +=strTmp[Integer.parseInt(tmp[i]+"")-1];
            }
            if(result.compareTo(str)>0){
                result = str;
            }
        }

        System.out.println(result);
    }

    public static char[] sinhHV(String input, int n) {
        char arr[] = input.toCharArray();
        int i = n - 2;
        while (arr[i] >= arr[i + 1]) {
            i--;
            if (i == -1) break;
        }

        if (i == -1) {
            ok = true;
        } else {
            char min = '9';
            int imin = i;
            for (int k = i + 1; k < n; k++) {
                if (arr[k] > arr[i] && arr[k] <= min) {
                    min = arr[k];
                    imin = k;
                }
            }

            char tmp = arr[i];
            arr[i] = arr[imin];
            arr[imin] = tmp;

            for (int k = i + 1; k < n - 1; k++) {
                for (int j = k + 1; j < n; j++) {
                    if (arr[k] > arr[j]) {
                        tmp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }

        return arr;
    }

}
