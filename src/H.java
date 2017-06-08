import java.util.Scanner;

/**
 * Created by ASUS on 6/6/2017.
 */
public class H {

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
       for(int i = 0;i<strTmp.length-1;i++){
           for(int j = i+1;j<strTmp.length;j++){
               if(strTmp[i].compareTo(strTmp[j])>0){
                   String tmp = strTmp[i];
                   strTmp[i] = strTmp[j];
                   strTmp[j] = tmp;
               }
           }
       }

        for (int j = 0; j < strTmp.length; j++) {
            System.out.print(strTmp[j]);
        }
        System.out.println();
    }

    public static boolean sinhHV(String input, int n) {
        boolean ok = true;
        char arr[] = input.toCharArray();
        int i = n - 2;
        while (arr[i] >= arr[i + 1]) {
            i--;
            if (i == -1) break;
        }

        if (i == -1) {
            ok = false;
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

            String ans = "";
            for (int j = 0; j < n; j++) {
                ans += arr[j];
            }
        }

        return ok;
    }

}
