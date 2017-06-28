package common;

import java.util.Scanner;

/**
 * Created by ASUS on 5/5/2017.
 */
public class FormatName {

    public static void main(String[] args) {
        System.out.println("Input name: ");

        String input = new Scanner(System.in).nextLine();

        System.out.println(formatNameInput(input));
    }

    public static String formatNameInput(String inputName) {
        //1. check inputName
        if (inputName == null || inputName.trim().length() == 0) {
            return "";
        }
        //2. inputName != undefined
        String strTmp[] = inputName.trim().split("[\\\\|\\\\.\\s]+");
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < strTmp.length; i++) {
            //format input
            String key = strTmp[i];
            //2.1 validate LowerCase
            key = key.toLowerCase();
            //2.2 validate UpperCase
            buffer.
                append((key.charAt(0) + "").toUpperCase() + key.substring(1))
                .append(" ");
        }

        return buffer.toString().trim();
    }
}
