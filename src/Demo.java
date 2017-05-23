import common.MD5;

import java.util.Scanner;

/**
 * Created by ASUS on 5/23/2017.
 */
public class Demo {

    public static void main(String[] args) {
        String password = new Scanner(System.in).nextLine();

        System.out.printf("Encode: %s", MD5.encodeMd5(password));
    }
}
