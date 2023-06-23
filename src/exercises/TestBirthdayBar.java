package exercises;

import java.util.Arrays;
import java.util.List;

public class TestBirthdayBar {

    public static void main(String[] args) {

    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int counter = 0;
        Integer[] chocolat = s.toArray(new Integer[s.size()]);

        for(int i = 0; i <= chocolat.length - m; i++ ){
            Integer[] segment = Arrays.copyOfRange(chocolat, i,i+m);
            Integer suma = Arrays.stream(segment).mapToInt(Integer::intValue).sum() ;

            if(suma == d)
                counter++;

        }
        return counter;
    }

}
