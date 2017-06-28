package common;

import java.util.Calendar;

/**
 * Created by ASUS on 5/23/2017.
 */
//https://www.dotnetperls.com/format-java
public class StringFormat {

    public static void main(String[] args) {
        // Call String.format with three integer codes.
        String result = String.format("One: %1$d Two: %2$d Three: %3$d",
                10, 20, 30);
        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            // Pad with zeros and a width of 5 chars.
            String result1 = String.format("%1$05d %2$05d", i, i + 10);
            System.out.println(result1);
        }

        double number = 1.23456;
        // Specify precision with format.
        String value = String.format("Three numbers after decimal: %1$.3f",
                number);
        System.out.println(value);

        Calendar cal = Calendar.getInstance();
        cal.set(2015, 1, 18);

        // Format the month.
        String result3 = String.format("Month: %1$tB %1$tb %1$tm", cal);
        System.out.println(result3);

        // Format the day.
        result3 = String.format("Day: %1$tA %1$ta %1$td", cal);
        System.out.println(result3);

        // Format the year.
        result3 = String.format("Year: %1$tY %1$ty %1$tj", cal);
        System.out.println(result3);
    }
}
