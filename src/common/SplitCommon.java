package common;

import java.util.Scanner;

/**
 * Created by ASUS on 5/5/2017.
 */
public class SplitCommon {
    public static void main(String[] args) {
        System.out.print("Input: ");
        String input = new Scanner(System.in).nextLine();

        String splitStr[] = input.trim().split("[\\s]+");

        if (splitStr.length > 0) {
            for (int i = 0; i < splitStr.length; i++) {
                System.out.println(splitStr[i]);
            }
        }
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