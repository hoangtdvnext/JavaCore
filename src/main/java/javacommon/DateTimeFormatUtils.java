package javacommon;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by hoangtd on 8/4/2017.
 */
public class DateTimeFormatUtils {

    /**
     * pattern:yyyy/MM/dd, ddMMyyyy...
     *
     * @param input
     * @param pattern
     * @return
     */
    public static String formatDate(DateTime input, String pattern){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(pattern);
        if(input == null)
            return "";

        String output;
        try {
            output = input.toString(dateTimeFormatter);
            return output;
        }catch (Exception e){
            return null;
        }
    }

}
