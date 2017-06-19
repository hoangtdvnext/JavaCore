package javaCore;

import java.math.BigDecimal;

/**
 * Created by ASUS on 6/19/2017.
 */
public class JavaBigDecimal {

    public static void main(String[] args) {
        // create 3 BigDecimal objects
        BigDecimal bg1, bg2, bg3;

        bg1 = new BigDecimal("12");
        bg2 = new BigDecimal("2");

        // divide bg1 with bg2 with 4 scale
        // 1 specifies BigDecimal.ROUND_DOWN
        bg3 = bg1.divide(bg2, 6, 1);

        String str = "Division result is " + bg3;

        // print bg3 value
        System.out.println(str);
    }
}
