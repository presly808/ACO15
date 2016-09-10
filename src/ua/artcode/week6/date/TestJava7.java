package ua.artcode.week6.date;

import sun.util.resources.cldr.rm.CalendarData_rm_CH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by serhii on 9/10/16.
 */
public class TestJava7 {

    public static void main(String[] args) {
        // JodaTime -> Java 8
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date);

        String format = String.format(
                "year %1$ty, month %1$tm, day %1$td, time %1$tH:%1$tM", date);
        System.out.println(format);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            Date date1 = simpleDateFormat.parse("1990-05-12");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar(1, 11, 12);
        Date fromCalendar = calendar.getTime();
        System.out.println(fromCalendar);
        System.out.println(fromCalendar.getTime());
        int month = calendar.get(Calendar.MONTH);

        calendar.setTime(date);




    }

}
