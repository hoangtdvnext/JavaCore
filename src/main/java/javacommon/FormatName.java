package javacommon;

import java.util.StringTokenizer;

/**
 * Created by ASUS on 5/5/2017.
 */
public class FormatName {

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
            buffer.append((key.charAt(0) + "").toUpperCase() + key.substring(1))
                  .append(" ");
        }

        return buffer.toString().trim();
    }

    public static String formatName(String value) {
        if(value == null || value.trim().length() == 0)
            return null;

        StringTokenizer st = new StringTokenizer(value);
        StringBuilder sb = new StringBuilder();
        // dung phuong thuc cua StringTokenizer de tach token
        while (st.hasMoreTokens()) {//tra ve true neu van con tach duoc token
            // tao sb de su dung phuong thuc cua StringBuilder
            String t = st.nextToken();
            //chuyen hóa chữ cái đầu sang chữ hoa
            sb.append(Character.toUpperCase(t.charAt(0)));
            for (int i = 1; i < t.length(); i++) {
                //chuyển các chữ cái tiếp theo sang chữ thường
                sb.append(Character.toLowerCase(t.charAt(i)));
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
