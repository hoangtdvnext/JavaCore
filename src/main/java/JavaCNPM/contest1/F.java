package JavaCNPM.contest1;

import java.util.Scanner;

/**
 * Created by Hoang Ta Duy on 6/6/2017.
 */
public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < n; i++) {
            chuanHoaXau(arr[i]);
        }
    }

    public static void chuanHoaXau(String strInput){
        String strTmp[] = strInput.trim().split("[\\\\|\\\\.\\s]+");
        StringBuffer buffer = new StringBuffer();
        String output = "";
        for (int i = 1; i < strTmp.length; i++) {
            //format input
            String key = strTmp[i];
            //2.1 validate LowerCase
            key = key.toLowerCase();
            //2.2 validate UpperCase
            buffer.append((key.charAt(0) + "").toUpperCase() + key.substring(1))
                    .append(" ");
        }

        output = buffer
                .append(", ")
                .append(strTmp[0]
                .toUpperCase())
                .toString().trim();
        System.out.println(output);
    }
}
