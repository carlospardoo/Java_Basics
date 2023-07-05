package exercises;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class TestCurrencyFormatter {
//https://en.wikipedia.org/wiki/List_of_Unicode_characters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double payment = Double.parseDouble(sc.nextLine());

        Locale locale = new Locale(Locale.ENGLISH.getLanguage(),Locale.US.getCountry());
        String formatPayment = NumberFormat.getCurrencyInstance(locale).format(payment);
        System.out.println("US: " + formatPayment);

        locale = new Locale(Locale.ENGLISH.getLanguage(), "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(locale);
        Currency india = Currency.getInstance("INR");
        indiaFormat.setCurrency(india);
        DecimalFormat decimalIndia = (DecimalFormat) indiaFormat;
        decimalIndia.setPositivePrefix("Rs.");
        formatPayment = decimalIndia.format(payment);
        char indiaMoney = '\u20B9'; //Unicode for character ₹
        // \u00A0 is unicode for special space, which avoid line break between two words
        System.out.println("India: " + formatPayment.replace(Character.toString(indiaMoney), "Rs.").replace(Character.toString('\u00A0'), ""));

        locale = new Locale(Locale.CHINESE.getLanguage(),Locale.CHINA.getCountry());
        formatPayment = NumberFormat.getCurrencyInstance(locale).format(payment);
        System.out.println("China: " + formatPayment.replace(Character.toString('\u00A5'), Character.toString('\uFFE5')));

        locale = new Locale(Locale.FRENCH.getLanguage(),Locale.FRANCE.getCountry());
        formatPayment = NumberFormat.getCurrencyInstance(locale).format(payment);
        System.out.println("France: " + formatPayment.replaceAll(Character.toString('\u202F'), " "));

    }
}
