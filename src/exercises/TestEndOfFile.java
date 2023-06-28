package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEndOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        int counter = 1;

        while(sc.hasNext()){
            String newLine = sc.nextLine();
            lines.add( (counter++) + " " + newLine);
        }

        lines.forEach( x -> System.out.println(x) );

    }

}
