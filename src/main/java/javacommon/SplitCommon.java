package javacommon;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by ASUS on 5/5/2017.
 */
public class SplitCommon {
    public static void main(String[] args) {
        System.out.print("Input: ");
        String input = new Scanner(System.in).nextLine();

        String splitStr[] = input.trim().split("[\\s,+]+");

        if (splitStr.length > 0) {
            for (int i = 0; i < splitStr.length; i++) {
                System.out.println(splitStr[i]);
            }
        }

        //convert utf-8
        String a = "Tạ Duy Hoàng";
        try {
            String msg = new String(a.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(msg);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String get(final String name, final String key, final Object... params){
        return "";
    }
}



//    String s = "Hello|dnh,blog.abc";
//    String result[] = s.split("[|,.]");
//    for(String r : result){
//            System.out.println(r);
//            }
//            http://www.journaldev.com/2573/spring-mvc-file-upload-example-single-multiple-files
//
//
//            split("[\\|\\.\\s]+")
//            dấu + là nhiều dấu liên tiếp cũng đều được cắt