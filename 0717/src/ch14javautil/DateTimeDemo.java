package ch14javautil;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/*
날짜, 시간을 읽어오는 방법
Date, Calendar, GregorianCalendar, DateFormat, SimpleDateFormat, String.format("%1$tY-%1$tm-%1$td", new Date())
 */
public class DateTimeDemo {
    public static void main(String[] args) {
        // 1. Date
        Date now = new Date();
        System.out.println(now);
        System.out.println();

        // 2. Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.printf("오늘은 %d년 %d월 %d일입니다.%n",
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println();

        // 3. GregorianCalendar
        Calendar gCalendar = new GregorianCalendar(2024, GregorianCalendar.DECEMBER, 25);
        System.out.printf("금년은 %d년%n", gCalendar.get(Calendar.YEAR));
        System.out.println();

        // 4. DateFormat
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, Locale.FRANCE);
        System.out.println(dateFormat.format(new Date()));
        System.out.println();

        // 5. SimpleDateFormat
        String pattern = "오늘은 yyyy년 MM월 dd일입니다.";
        DateFormat sDateFormat = new SimpleDateFormat(pattern);
        System.out.println(sDateFormat.format(new Date()));
        System.out.println();

        // 6. String.format
        String today = String.format("오늘은 %1$tY년 %1$tm월 %1$td일입니다.%n", new Date());
        System.out.println(today);
    }
}
