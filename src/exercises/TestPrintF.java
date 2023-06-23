package exercises;

import java.util.Arrays;

public class TestPrintF {

    public static void main(String[] args) {

        String[] input = {"java 6", "program 56", "carlosdavid 123"};

//        String[] value1 = input[0].split(" ");
//        String[] value2 = input[1].split(" ");
//        String[] value3 = input[2].split(" ");
//
//        System.out.printf("%s%n", "=".repeat(32));
//        System.out.printf("%-15s%03d%n", value1[0], Integer.parseInt(value1[1]));
//        System.out.printf("%-15s%03d%n", value2[0], Integer.parseInt(value2[1]));
//        System.out.printf("%-15s%03d%n", value3[0], Integer.parseInt(value3[1]));
//        System.out.printf("%s%n", "=".repeat(32));

        System.out.printf("%s%n", "=".repeat(32));
        Arrays.stream(input).forEach(x -> {
            String[] row = x.split(" ");
            System.out.printf("%-15s%03d%n", row[0], Integer.parseInt(row[1]));
        } );
        System.out.printf("%s%n", "=".repeat(32));

    }
}
