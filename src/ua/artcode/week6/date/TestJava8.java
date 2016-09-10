package ua.artcode.week6.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

/**
 * Created by serhii on 9/10/16.
 */
public class TestJava8 {


    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(1990, 19, 05);
        LocalDate localDate2 = LocalDate.now();

        localDate1.get(ChronoField.DAY_OF_MONTH);


    }
}
