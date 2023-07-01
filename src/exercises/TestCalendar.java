package exercises;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class TestCalendar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(findDay(month, day, year));

    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month - 1, day);

        String dayOfDate = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US );

        return dayOfDate.toUpperCase(Locale.ROOT);
    }

}
