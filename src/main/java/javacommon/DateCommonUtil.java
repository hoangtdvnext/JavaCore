package javacommon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hoang Ta Duy on 10/25/2017.
 */
public class DateCommonUtil {

    public static void main(String[] args) {
        String dateInString = "20170909";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        try {
            //1. get day in month
            Date date = sdf.parse(dateInString);
            //
            Calendar calendar = dateToCalendar(date);
            // get thứ
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
            // get max day in month
            int numberDay = calendar.getMaximum(Calendar.DAY_OF_MONTH);
            calendar.add(Calendar.DATE, numberDay - calendar.get(Calendar.DATE));
            for(int i = numberDay; i >0;i--){
                if(calendar.get(Calendar.DAY_OF_WEEK) > 1 && calendar.get(Calendar.DAY_OF_WEEK) < 7){
                    System.out.println(calendar.get(Calendar.DATE));
                    break;
                }
                calendar.add(Calendar.DATE, -1);////
            }

            //2. get w


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static Calendar dateToCalendar(Date dateInput){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateInput);

        return calendar;
    }

    public static Date calendarToDate(Calendar calendarInput){
        Date date = calendarInput.getTime();

        return date;
    }

    public static String getStrByDate(Date date){
        Map<Date, Date> mapT = new HashMap<>();
        Map<Date, Date> mapD = new HashMap<>();
        Map<Date, Date> mapH = new HashMap<>();
        Map<Date, Date> mapF = new HashMap<>();


        return "";
    }
}
