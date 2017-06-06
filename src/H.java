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

}
