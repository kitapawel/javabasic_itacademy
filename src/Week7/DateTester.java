package Week7;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTester {
    public static void main(String[] args) throws ParseException {
        System.out.println("===Old java 8 way of formatting time===");
        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date anotherDay = format.parse("2019-12-21");
        System.out.println(anotherDay);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MONTH, 1);
        Date changedDate = calendar.getTime();
        System.out.println(changedDate);
        SimpleDateFormat anotherFormat = new SimpleDateFormat("MM");
        System.out.println(anotherFormat.format(changedDate));

        System.out.println("===New java 11 way of formatting time===");
        System.out.println("==date separated from time==");
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        LocalDateTime dateWithTime = LocalDateTime.now();
        System.out.println(dateWithTime);

        System.out.println("==incrementing time==");
        today.plus(10, ChronoUnit.DAYS);
        System.out.println(today);
        LocalDate incrementedDate = today.plus(10, ChronoUnit.DAYS);
        System.out.println(incrementedDate);

        System.out.println("==parsing formats==");
        LocalDate parsedDate = LocalDate.parse("2019-02-20");
        System.out.println(parsedDate);
        parsedDate = LocalDate.of(2019, 12, 21);
        System.out.println(parsedDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate2 = LocalDate.parse("01-01-2020", formatter);
        System.out.println(parsedDate2);

    }



}
